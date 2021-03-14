package com.jvmbootcamp.jpahibernate2.component_mapping.entities;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Salary {
    @Column(name="basic_salary")
    private Integer basic_salary;
    @Column(name="bonus_salary")
    private Integer bonus_salary;
    @Column(name="tax_amount")
    private Integer tax_amount;
    @Column(name="special_allowance_salary")
    private Integer special_allowance_salary;

    public Integer getBasic_salary() {
        return basic_salary;
    }
    public void setBasic_salary(Integer basic_salary) {
        this.basic_salary = basic_salary;
    }

    public Integer getBonus_salary() { return bonus_salary; }
    public void setBonus_salary(Integer bonus_salary) {
        this.bonus_salary = bonus_salary;
    }

    public Integer getTax_amount() {
        return tax_amount;
    }
    public void setTax_amount(Integer tax_amount) {
        this.tax_amount = tax_amount;
    }

    public Integer getSpecial_allowance_salary() {
        return special_allowance_salary;
    }
    public void setSpecial_allowance_salary(
            Integer special_allowance_salary) {
        this.special_allowance_salary = special_allowance_salary;
    }
}
