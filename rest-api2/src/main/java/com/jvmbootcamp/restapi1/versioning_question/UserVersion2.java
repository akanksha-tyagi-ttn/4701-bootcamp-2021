package com.jvmbootcamp.restapi1.versioning_question;

public class UserVersion2 {
    String firstName,lastName;
    int age;
    String emailAddr;
    int phoneNumber;
    String county;

    public UserVersion2() {
    }

    public UserVersion2(String firstName, String lastName,
                        int age, String emailAddr,
                        int phoneNumber, String county) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.emailAddr = emailAddr;
        this.phoneNumber = phoneNumber;
        this.county = county;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
