# MPA (MyBatis Persistence Assistant)

> MyBatis ORM을 확장한 강력한 Java 라이브러리로, 자동 코드 생성, 포괄적인 감사 추적, 멀티스코프 데이터베이스 지원을 제공합니다.

## 프로젝트 정보

- **Group ID**: `iit`
- **Artifact ID**: `mpa`
- **Version**: `1.0.0`
- **Java Version**: 8
- **Spring Boot**: 2.7.2

## 주요 기능

### 1. 코드 자동 생성 시스템

데이터베이스 스키마로부터 Entity, Mapper, Repository를 자동으로 생성합니다.

**특징:**
- XML 기반 설정 (`mybatis-persistence-assistant.xml`)
- JDBC 기반 스키마 검사
- MyBatis Dynamic SQL 지원
- 타입 안전 쿼리 DSL 생성

**생성되는 파일:**
- Entity 클래스 (`@Entity`, `@Id` 어노테이션 포함)
- Mapper 인터페이스
- Repository 인터페이스
- DynamicSqlSupport 클래스
- Qualifier 어노테이션

**사용 방법:**
```bash
mvn compile -P mybatis-persistence-assistant:generate
```

### 2. 멀티스코프 데이터소스 지원

하나의 애플리케이션에서 여러 데이터베이스/스키마를 동시에 사용할 수 있습니다.

**핵심 개념:**
- **Scope**: 데이터베이스 연결 설정을 나타냄
- **DEFAULT$**: 단일 데이터베이스 설정의 기본 스코프
- **Qualifier 어노테이션**: 자동 생성되어 의존성 주입에 사용

**장점:**
- 멀티테넌시 지원
- 다중 데이터베이스 지원
- 스코프별 격리된 Entity/Repository 네임스페이스

### 3. 데이터베이스 감사 추적 시스템

모든 데이터베이스 변경사항(INSERT, UPDATE, DELETE)을 자동으로 추적하고 기록합니다.

**핵심 기능:**

#### 자동 추적
- MyBatis 작업을 AOP를 통해 인터셉트
- 엔티티의 변경 전/후 상태 캡처
- 트랜잭션 경계 추적
- 변경 메타데이터 기록

#### 이벤트 타입
- `TRANSACTION`: Spring 트랜잭션 내에서 자동 추적
- `MANUALLY`: 명시적 감사 이벤트 생성

#### 커맨드 타입
- `INSERT`: 새 레코드 생성
- `UPDATE`: 레코드 수정
- `DELETE`: 레코드 삭제

#### 감사 정보
- 스코프 정보
- 이벤트 타입
- 커맨드 타입
- 라벨 (사용자 정의 설명)
- 테이블 명
- 원본 데이터 (변경 전)
- 수정 데이터 (변경 후)
- 타임스탬프
- 기본키 값

#### JOIN 지원
관련 테이블의 데이터도 함께 감사할 수 있습니다.

```java
@TestConfiguration
public class MemberAuditConfiguration implements EntityAuditConfigurer<Member> {
    @Override
    public void join(AuditJoinContext<Member> context) {
        context.add(JoinDSL
            .leftJoin(MyLike.class)
            .select(s -> s
                .changeValue(member.email).to(myLike.count)
                .add(myLike.count).alias("like_count"))
            .on(o -> o
                .set(member.id).isEqualTo(myLike.memberId)));
    }
}
```

#### 리스너
감사 이벤트에 훅을 걸 수 있습니다.

```java
assistant.registerAuditTrailListener(new AuditTrailListener() {
    @Override
    public void beforeCommit(List<AuditTrail> trails) {
        // 커밋 전 처리
    }

    @Override
    public void afterCommit(List<AuditTrail> trails) {
        // 커밋 후 처리
    }
});
```

#### 수동 감사 추적
`@Mutations` 어노테이션으로 메서드를 명시적으로 표시할 수 있습니다.

```java
@Mutations("회원 정보 수정")
public void updateMemberInfo(Member member) {
    memberRepository.update(member);
}
```

### 4. 향상된 Repository 패턴

기본 MyBatis 매퍼를 넘어선 풍부한 Repository 인터페이스를 제공합니다.

**특징:**
- `MybatisPersistenceAssistantRepository<T>` 마커 인터페이스
- 편의 메서드 제공 (예: 파라미터 없는 `findAll()`)
- MyBatis Dynamic SQL의 타입 안전 쿼리 DSL

## 기술 스택

### 핵심 기술
- **Java**: 8
- **Spring Boot**: 2.7.2
- **MyBatis**: 2.2.2
- **MyBatis Dynamic SQL**: 1.5.2
- **MyBatis Generator**: 1.4.2

### 지원 라이브러리
- **Lombok**: 1.18.38
- **H2 Database**: 2.3.232
- **Spring AOP**

## 프로젝트 구조

```
/Users/eonnine/Desktop/my/mpa/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── mpa/
│   │   │   │   ├── audit/           # 감사 추적 시스템
│   │   │   │   ├── config/          # 설정 클래스
│   │   │   │   ├── context/         # 메인 컨텍스트 및 초기화
│   │   │   │   ├── persistence/     # 퍼시스턴스 레이어
│   │   │   │   └── util/            # 유틸리티 클래스
│   │   │   └── mybatis-persistence/ # 생성된 코드
│   │   └── resources/
│   │       ├── mybatis-persistence-assistant.xml
│   │       ├── assembly.xml
│   │       └── application.yml
│   └── test/
│       ├── java/
│       │   └── mpa/
│       │       ├── fixture/         # 테스트 픽스처
│       │       └── repository/      # Repository 테스트
│       └── resources/
│           └── application-test.yml
├── pom.xml
└── README.md
```

### 핵심 패키지

- **`mpa.context`**: 애플리케이션 컨텍스트 및 초기화
- **`mpa.config`**: 설정 지원
- **`mpa.persistence`**: 핵심 퍼시스턴스 기능
  - `annotation`: `@Mutations` 어노테이션
  - `config`: 설정 클래스, 감사 설정
  - `context`: 스코프 관리, 데이터소스 인식
  - `database`: 데이터베이스 메타데이터 SQL
  - `entity`: 엔티티 메타데이터, 캐싱, 스키마
  - `event`: 변경 이벤트, 트랜잭션 리스너
  - `generator`: 코드 생성 엔진
  - `transaction`: 트랜잭션 동기화
- **`mpa.audit`**: 포괄적인 감사 추적 시스템
  - `annotation`: `@AuditIgnore`
  - `config`: 감사 설정
  - `repository`: 감사 데이터 접근, SQL 생성
    - `sql`: SQL 생성, 쿼리 작성
    - `join`: Join DSL 및 SQL 생성
- **`mpa.util`**: 유틸리티 함수

## 설정

### Generator 설정 (`mybatis-persistence-assistant.xml`)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <generator>
        <scope default="true">
            <dataSource>
                <driverClassName>org.h2.Driver</driverClassName>
                <connectionURL>jdbc:h2:~/testdb;AUTO_SERVER=TRUE</connectionURL>
                <username>sa</username>
                <password></password>
                <schema>PUBLIC</schema>
            </dataSource>
        </scope>
    </generator>
</configuration>
```

### Spring Boot 설정 (`application.yml`)

```yaml
spring:
  datasource:
    driver-class-name: org.h2.Driver
    url: jdbc:h2:~/example;AUTO_SERVER=TRUE
    username: sa
    password:
```

## 빌드 및 사용

### 빌드

기본 빌드:
```bash
mvn clean package
```

생성되는 JAR 파일:
- `mpa-plain.jar`: 일반 라이브러리 JAR
- `mpa.jar`: 의존성이 포함된 Shaded JAR

### 코드 생성

```bash
mvn compile -P mybatis-persistence-assistant:generate
```

생성 위치: `src/main/java/mybatis-persistence/`

### 개발 워크플로우

1. **데이터베이스 설정**: H2 또는 다른 데이터베이스 구성
2. **Generator 설정**: `mybatis-persistence-assistant.xml` 편집
3. **코드 생성**: Generator 프로파일 실행
4. **비즈니스 로직 구현**: 생성된 Repository 사용
5. **감사 설정** (선택): `EntityAuditConfigurer` 구현
6. **라이브러리 빌드**: JAR로 패키징
7. **배포**: 다른 프로젝트에서 의존성으로 사용

## 사용 예시

### 기본 Repository 사용

```java
@Autowired
MemberRepository memberRepository;

// 삽입
Member member = new Member();
member.setName("tester");
memberRepository.insert(member);

// 조회
List<Member> all = memberRepository.findAll();
long count = memberRepository.count();

// 수정
member.setName("updated");
memberRepository.update(member);

// 삭제
memberRepository.delete(member);
```

### 감사 추적 사용

```java
@Autowired
MybatisPersistenceAssistant assistant;

// 감사 시작
assistant.activateAuditing();

// 리스너 등록
assistant.registerAuditTrailListener(new AuditTrailListener() {
    @Override
    public void beforeCommit(List<AuditTrail> trails) {
        // 감사 정보 처리
        trails.forEach(trail -> {
            System.out.println("Table: " + trail.getTableName());
            System.out.println("Command: " + trail.getCommandType());
            System.out.println("Original: " + trail.getOriginal());
            System.out.println("Updated: " + trail.getUpdated());
        });
    }
});
```

### 수동 감사 이벤트

```java
AuditEventExecutor executor = assistant.createAuditEventExecutor()
    .defaultScope()
    .label("사용자 정의 작업")
    .build();

executor.addEntity(entity);
executor.execute();
```

### @Mutations 어노테이션 사용

```java
@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Mutations("회원 등록")
    public void registerMember(Member member) {
        memberRepository.insert(member);
        // 이 메서드의 모든 변경사항이 자동으로 감사됨
    }
}
```

## 지원 데이터베이스

- **H2**: 내장 데이터베이스 (개발/테스트)
- **PostgreSQL**: 커스텀 메타데이터 SQL 구현
- **기타**: `MetaDataSQL` 인터페이스를 통해 확장 가능

## 아키텍처 특징

### 패키지 쉐이딩
MyBatis와 H2 패키지를 재배치하여 버전 충돌을 방지합니다:
- `org.apache.ibatis` → `org.mpa.apache.ibatis`
- `org.mybatis` → `org.mpa.mybatis`
- `org.h2` → `org.mpa.h2`

### AOP 기반 변경 추적
Spring AOP를 사용하여 비침투적으로 Repository 메서드를 인터셉트합니다.

### 팩토리 기반 의존성 관리
복잡한 의존성 그래프를 관리하기 위한 커스텀 팩토리 패턴을 사용합니다.

### 캐싱 전략
- **EntityCache**: 인메모리 엔티티 메타데이터 캐시
- **AuditSQLCache**: 생성된 SQL 문 캐시
- 시작 시 즉시 로딩
- 수동 새로고침 기능

## 사용 사례

1. **엔터프라이즈 애플리케이션**: 포괄적인 감사 추적이 필요한 경우
2. **멀티테넌트 애플리케이션**: 스코프 기반 데이터 격리
3. **규제 준수**: 금융, 의료 등 변경 이력 추적이 필수인 도메인
4. **타입 안전 MyBatis**: 컴파일 타임 타입 체크가 필요한 프로젝트
5. **마이크로서비스**: 표준화된 데이터 접근 패턴
6. **변경 이력 시스템**: 상세한 변경 추적 및 이력 관리

## 테스트

```bash
mvn test
```

테스트 구성:
- **basic/**: 기본 CRUD 작업 테스트
- **audit/**: 감사 추적 기능 테스트 (JOIN 테스트, 이벤트 테스트)
- **generator/**: 코드 생성 테스트

## 라이선스

(라이선스 정보 추가 필요)

## 기여

(기여 가이드라인 추가 필요)

## 문서

- [Spring Boot 참조 문서](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/)
- [MyBatis 공식 문서](https://mybatis.org/mybatis-3/)
- [MyBatis Dynamic SQL](https://mybatis.org/mybatis-dynamic-sql/)

## 연락처

(연락처 정보 추가 필요)
