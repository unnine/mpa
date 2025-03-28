package mpa.persistence;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MybatisRepository<E, ID> {

    E findAll();

    E findById(ID id);

    int insert(E e);

    int update(E e);

    int delete(ID id);

}
