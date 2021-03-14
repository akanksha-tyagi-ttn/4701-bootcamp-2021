package com.jvmbootcamp.jpahibernate2.inheritance.repos;
import com.jvmbootcamp.jpahibernate2.inheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository
        extends CrudRepository<Payment,Integer> {

}
