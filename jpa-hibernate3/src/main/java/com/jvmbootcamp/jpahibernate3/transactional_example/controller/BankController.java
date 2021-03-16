package com.jvmbootcamp.jpahibernate3.transactional_example.controller;
import com.jvmbootcamp.jpahibernate3.transactional_example.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @Autowired
    BankService service;

    @GetMapping("/insert-bankaccount")
    public String insert(){
        service.insertAccount();
        return "2 accounts created";
    }
    @GetMapping("/transfer/{amount}")
    public void transferAmount(@PathVariable double amount){
        service.transfer(amount);
    }

}
