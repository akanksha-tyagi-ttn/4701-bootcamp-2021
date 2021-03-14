package com.jvmbootcamp.jpahibernate2.inheritance.controller;
import com.jvmbootcamp.jpahibernate2.inheritance.entities.Cheque;
import com.jvmbootcamp.jpahibernate2.inheritance.entities.CreditCard;
import com.jvmbootcamp.jpahibernate2.inheritance.entities.Payment;
import com.jvmbootcamp.jpahibernate2.inheritance.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    PaymentService service;

    //single table
    // http://localhost:8080/jpa2-payments/singletable/creditcard
    @PostMapping("/jpa2-payments/singletable/creditcard")
    public Payment createCreditCardPayment(@RequestBody CreditCard card){
        return service.createPaymentByCard(card);
    }

    //http://localhost:8080/jpa2-payments/singletable/cheque
    @PostMapping("/jpa2-payments/singletable/cheque")
    public Payment createChequePayment(@RequestBody Cheque cheque){
        return service.createPaymentByCheque(cheque);
    }

    //http://localhost:8080/jpa2-payments/singletable-data
    @GetMapping("/jpa2-payments/singletable-data")
    public List<Payment> getAllData(){
        return service.getAll();
    }
    //---------------------------------------------------------------------------//
    //table per class
    // http://localhost:8080/jpa2-payments/tablePerClass/creditcard
    @PostMapping("/jpa2-payments/tablePerClass/creditcard")
    public Payment createCard_tablePerUser(@RequestBody CreditCard card){
        return service.createPaymentByCard(card);
    }

    //http://localhost:8080/jpa2-payments/tablePerClass/cheque
    @PostMapping("/jpa2-payments/tablePerClass/cheque")
    public Payment createCheque_tablePerUser(@RequestBody Cheque cheque){
        return service.createPaymentByCheque(cheque);
    }

    //http://localhost:8080/jpa2-payments/tablePerClass-data
    @GetMapping("/jpa2-payments/tablePerClass-data")
    public List<Payment> getAll(){
        return service.getAll();
    }
//---------------------------------------------------------------------------//
    // joined
    // http://localhost:8080/jpa2-payments/joined/creditcard
    @PostMapping("/jpa2-payments/joined/creditcard")
    public Payment createCard_joined(@RequestBody CreditCard card){
        return service.createPaymentByCard(card);
    }

    //http://localhost:8080/jpa2-payments/joined/cheque
    @PostMapping("/jpa2-payments/joined/cheque")
    public Payment createCheque_joined(@RequestBody Cheque cheque){
        return service.createPaymentByCheque(cheque);
    }

    //http://localhost:8080/jpa2-payments/joined-data
    @GetMapping("/jpa2-payments/joined-data")
    public List<Payment> getAll_joined(){
        return service.getAll();
    }

}
