package com.jvmbootcamp.jpahibernate2.inheritance.entities;
import javax.persistence.*;

@Entity
@Table(name="creditcard")
//@PrimaryKeyJoinColumn(name="id")
//@DiscriminatorValue("cc")
public class CreditCard extends Payment{
    @Column(name="cardnumber")
    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
