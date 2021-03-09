package com.jvmbootcamp.restapi1.versioning_question;

public class UserVersion1 {
    String firstname;
    String lastname;
    public UserVersion1() {
    }

    public UserVersion1(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
