package com.jvmbootcamp.jpahibernate2.inheritance.services;
import com.jvmbootcamp.jpahibernate2.inheritance.entities.Cheque;
import com.jvmbootcamp.jpahibernate2.inheritance.entities.CreditCard;
import com.jvmbootcamp.jpahibernate2.inheritance.entities.Payment;
import com.jvmbootcamp.jpahibernate2.inheritance.repos.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository repository;

    public List<Payment> getAll(){
        return (List<Payment>) repository.findAll();
    }
    //creating entry of credit card
    public Payment createPaymentByCard(CreditCard card){
        return repository.save(card);
    }

    //creating entry of cheque
    public Payment createPaymentByCheque(Cheque cheque){
        return repository.save(cheque);
    }
}
