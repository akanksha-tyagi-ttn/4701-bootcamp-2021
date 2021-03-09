package com.jvmbootcamp.restapi1.filtering;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

//@ApiModel("User data, username and password..")
@JsonFilter("userFilter")
public class UserBean {
    private String username;
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public UserBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "UserBean{" + "\nusername='" + username + '\'' +
                ",\npassword='" + password + '\'' +
                '}';
    }
}
