package com.jvmbootcamp.jpahibernate3.transactional_example.services;
import com.jvmbootcamp.jpahibernate3.transactional_example.entities.BankAccount;
import com.jvmbootcamp.jpahibernate3.transactional_example.repos.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankService {
    @Autowired
    BankRepository repository;

    public void insertAccount(){
        BankAccount bankAccount1=new BankAccount();
        bankAccount1.setFullName("akanksha-tyagi");
        bankAccount1.setBalance(5000d);

        BankAccount bankAccount2=new BankAccount();
        bankAccount2.setFullName("Modi ji");
        bankAccount2.setBalance(1000);

        repository.save(bankAccount1); repository.save(bankAccount2);
    }

    @Transactional
    public void transfer(double amount){
        BankAccount bankAccount1=repository.findById(1).get();
        bankAccount1.setBalance(bankAccount1.getBalance()-amount);
        repository.save(bankAccount1);

        if(true){
            throw new RuntimeException();
        }
        BankAccount bankAccount2=repository.findById(2).get();
        bankAccount2.setBalance(bankAccount2.getBalance()+amount);
        repository.save(bankAccount2);
    }
    public List<BankAccount> showAccounts(){
        return (List<BankAccount>) repository.findAll();
    }

}
