package com.jvmbootcamp.jpahibernate3.transactional_example.repos;
import com.jvmbootcamp.jpahibernate3.transactional_example.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<BankAccount,Integer> {
}
