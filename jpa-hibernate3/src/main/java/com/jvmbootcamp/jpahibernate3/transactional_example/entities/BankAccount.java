package com.jvmbootcamp.jpahibernate3.transactional_example.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountNum;
    private  String fullName;
    private double balance;

    public Integer getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
