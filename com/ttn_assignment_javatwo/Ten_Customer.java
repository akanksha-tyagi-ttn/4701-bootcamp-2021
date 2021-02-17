package com.ttn_assignment_javatwo;

public class Ten_Customer
{
    String customer_name;
    int customer_age;
    String address;
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCustomer_age(int customer_age) {
        this.customer_age = customer_age;
    }
    public int getCustomer_age() {
        return customer_age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString()
    {
        return "{{ name:: "+this.customer_name+"" +
                "\nAge: "+this.customer_age +
                "\nAddress: "+this.address+" }}";
    }

}
