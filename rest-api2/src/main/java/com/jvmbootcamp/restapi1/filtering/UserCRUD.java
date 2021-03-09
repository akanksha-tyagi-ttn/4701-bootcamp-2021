package com.jvmbootcamp.restapi1.filtering;
import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
@ApiModel("the CRUD operation class of UserBean")
public class UserCRUD {
    private static List<UserBean> userList=
            new ArrayList<>();
    static {
        userList.add(new UserBean("akanksha","akanksha123"));
        userList.add(new UserBean("tanyatyagi","12345"));
    }

    public List<UserBean> getUserList(){
        return userList;
    }
    public UserBean addUser(UserBean user) {
        userList.add(user);
        return user;
    }
}
