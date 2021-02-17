package com.ttn_assignment_javatwo;

class Address implements Cloneable
{
    int house_no;
    String city,locality,state;

    public Address(int house,String city,String locality,String state)
    {
        this.house_no=house;
        this.city=city;
        this.locality=locality; this.state=state;
    }
    //setter and getter of house
    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }

    public int getHouse_no() {
        return house_no;
    }

    //getter and setter of city
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    //getter and setter of locality
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getLocality() {
        return locality;
    }

    // setter and getter of state
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString()
    {
        return "{House No: "+house_no+
                "\nlocality: "+locality+
                "\nCity: "+ city+
                "\nState: "+state +"}";
    }
}
public class CloneExample
{
    public static void main(String[] args)
    {
        System.out.println("Object 1 is created");
        Address addr_one=new Address(12,"New Delhi","Sadiq Nagar","Delhi");
        System.out.println(addr_one.toString());
        try {
            System.out.println("\nObject 2 is cloned");
            Address addr_two=(Address)addr_one.clone();
            System.out.println(addr_two.toString());
            System.out.println("\nChanging the contents of object 2.. ");
            addr_two.setLocality("Kalka Ji"); addr_two.setHouse_no(25);

            System.out.println("\nObject 1:: "+addr_one.toString());
            System.out.println("\nObject 2:: "+addr_two.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
