package com.product.ws.api.base;

import com.product.ws.model.base.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@NoRepositoryBean
public interface BaseRepository<T extends BaseModel>
        extends JpaSpecificationExecutor<T>,
        PagingAndSortingRepository<T, UUID>,
        CrudRepository<T, UUID>,
        JpaRepository<T, UUID> {

    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e ")
    List<T> findAll();


    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id = ?1 ")
    Optional<T> findById(UUID id);


    @Override
    @Transactional(readOnly = true)
    @Query("select count(e) from #{#entityName} e ")
    long count();

    @Override
    @Transactional(readOnly = true)
    default boolean existsById(UUID id) {
        return findById(id).isPresent();
    }

    @Override
    @Query("delete from #{#entityName} e where e.id = ?1")
    @Transactional
    @Modifying
    void deleteById(UUID id);

    @Override
    @Transactional
    default void delete(T entity) {
        deleteById(entity.getId());
    }

    @Override
    @Transactional
    default void deleteAll(Iterable<? extends T> entities) {
        entities.forEach(entity -> deleteById(entity.getId()));
    }

    @Override
    @Query("delete from #{#entityName} e ")
    @Transactional
    @Modifying
    void deleteAll();
}
