package com.jvmbootcamp.springsecurityoath.repos;
import com.jvmbootcamp.springsecurityoath.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
