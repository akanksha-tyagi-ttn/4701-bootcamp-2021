package com.jvmbootcamp.jpahibernate3.services;
import com.jvmbootcamp.jpahibernate3.entities.Address;
import com.jvmbootcamp.jpahibernate3.entities.Author;
import com.jvmbootcamp.jpahibernate3.repos.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository repository;

    public List<Author> getAllAuthors() {
        return (List<Author>) repository.findAll();
    }

    public void createAuthor(){
        Address addr=new Address();
        addr.setStreetNumber("B-24");
        addr.setLocation("sadiq nagar");
        addr.setState("Delhi");

        Author author=new Author();
        author.setName("akankshatyagi");
        author.setAddress(addr);
        repository.save(author);
    }
}
