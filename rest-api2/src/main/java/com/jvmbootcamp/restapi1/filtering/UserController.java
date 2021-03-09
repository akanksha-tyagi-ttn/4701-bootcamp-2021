package com.jvmbootcamp.restapi1.filtering;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import  java.util.*;

@RestController
@ApiModel("User controller, put and get request to access the details of all the users and " +
        "create the user respectively")
public class UserController {
    @Autowired
    UserCRUD service;
//    @GetMapping("/getAllUser")
//    @ApiOperation(value="returns the details of all the UserBeans")
//    public List<UserBean> getAllUser(){
//       return service.getUserList();
//    }
//
//    @PostMapping("/saveUser")
//    @ApiOperation(value="creates the new UserBean with static filtering")
//    public ResponseEntity<Object> addUserMapper(@RequestBody UserBean user){
//        UserBean createdUser=service.addUser(user);
//        URI location= ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{username}")
//                .buildAndExpand(createdUser.getUsername())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }

    //dynamic
    @GetMapping("/getAllUserDynamic")
    @ApiOperation(value="returns the details of all the UserBeans")
    public MappingJacksonValue getAllUserDynamic(){
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter
                .serializeAllExcept("password");
        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("userFilter", simpleBeanPropertyFilter);
        List<UserBean> userList = service.getUserList();
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(userList);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    @PostMapping("/dynamicSaveUser")
    @ApiOperation("creates UserBean, with dynamic filtering")
    public MappingJacksonValue addUserDynamic(@RequestBody UserBean user){
        UserBean createdUser=service.addUser(user);
        SimpleBeanPropertyFilter simpleBeanPropertyFilter=SimpleBeanPropertyFilter
                .serializeAllExcept("password");
        FilterProvider filters=new SimpleFilterProvider()
                .addFilter("userFilter",simpleBeanPropertyFilter);
        MappingJacksonValue mapping=new MappingJacksonValue(createdUser);
        mapping.setFilters(filters);
        return mapping;
    }
}
