package com.jvmbootcamp.jpahibernate3.repos;
import com.jvmbootcamp.jpahibernate3.entities.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
