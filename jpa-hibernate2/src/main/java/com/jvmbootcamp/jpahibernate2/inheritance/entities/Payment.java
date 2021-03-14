package com.jvmbootcamp.jpahibernate2.inheritance.entities;
import javax.persistence.*;

//single_table- discriminator column for extending classes
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="pmode",
//        discriminatorType = DiscriminatorType.STRING)

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private double amount;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
