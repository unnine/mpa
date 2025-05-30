package mpa.persistence;

import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface MybatisRepository<E, ID> {

    E findAll();

    E findAll(Paging paging);

    E findById(ID id);

    int insert(E e);

    int insertAll(Collection<E> e);

    int update(E e);

    int updateAll(Collection<E> e);

    int delete(ID id);

    int deleteAll(Collection<ID> id);

}
