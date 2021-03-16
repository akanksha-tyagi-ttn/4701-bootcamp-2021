package com.jvmbootcamp.jpahibernate3.controller;
import com.jvmbootcamp.jpahibernate3.entities.Author;
import com.jvmbootcamp.jpahibernate3.repos.AuthorRepository;
import com.jvmbootcamp.jpahibernate3.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorService service;

    @GetMapping("/cachingexample")
    public void caching()
    {
        service.removeCacheCheck();
       //service.cacheCheck();
    }

    @GetMapping("/get-authors")
    public String getAll() {
        return service.getAllAuthors();
    }

    @PostMapping("/create-author")
    public String create() {
        //service.createAuthorBook();
        //service.createAuthorBookOneToManyBidirectional();
        service.createAuthorBookManyToMany();
        return "Many to Many\n" +
                "author with subjects and books created";
    }
}
