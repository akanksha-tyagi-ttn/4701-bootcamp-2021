package com.jvmbootcamp.jpahibernate3.services;
import com.jvmbootcamp.jpahibernate3.entities.Address;
import com.jvmbootcamp.jpahibernate3.entities.Author;
import com.jvmbootcamp.jpahibernate3.entities.Book;
import com.jvmbootcamp.jpahibernate3.entities.Subject;
import com.jvmbootcamp.jpahibernate3.repos.AuthorRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired  AuthorRepository repository;
    @Autowired
    EntityManager entityManager;

    public Optional<Author> removeCacheCheck(){
        Session session=entityManager.unwrap(Session.class);
        Optional<Author> author=repository.findById(1); //1st
        repository.findById(1); //2nd
        session.evict(author.get());
        repository.findById(1); //3rd
        return author;
    }

//    public Optional<Author> levelOneCacheCheck(){
//        Optional<Author> author=repository.findById(1);
//        repository.findById(1); //2nd
//        repository.findById(1); //3rd
//        return author;
//    }

    @Transactional
    public String getAllAuthors() {
        Author author = repository.findById(1).get();
        return author.toString();
    }
    public void createAuthorBookManyToMany(){
        Address address=new Address();
        address.setStreetNumber("B-24");
        address.setLocation("Sadiq Nagar");
        address.setState("Delhi");

        List<Book> bookList=new ArrayList<>();
        Book book1=new Book();
        book1.setBookName("Spring jpa- Volume 1");
        Book book2=new Book();
        book2.setBookName("Spring jpa- Volume 2 ");
        bookList.add(book1); bookList.add(book2);

        //we are taking one author only:
        Author author=new Author();
        author.setAddress(address); author.setBookList(bookList);
        repository.save(author); }

//    public void createAuthorBookOneToManyBidirectional(){
//        Author author=new Author();
//        author.setName("akankshatyagi");
//
//        Address addr=new Address();
//        //address fields
//        addr.setStreetNumber("B-24");
//        addr.setLocation("sadiq nagar");
//        addr.setState("Delhi");
//
//        //subjects
//        Subject subject1=new Subject();
//        subject1.setSubjectName("Java Core");
//        Subject subject2= new Subject();
//        subject2.setSubjectName("JavaScript");
//        Subject subject3=new Subject();
//        subject3.setSubjectName("React JS");
//
//        //Books
//        List<Book> list=new ArrayList<>();
//        Book book1=new Book();
//        book1.setBookName("Effective Java- Volume 1");
//        Book book2=new Book();
//        book2.setBookName("Effective Java- Volume 2 ");
//        list.add(book1); list.add(book2);
//
//        //author add with subjects and books;
//        author.setAddress(addr);
//            author.setBookList(list);
//        author.addSubjects(subject1);
//        author.addSubjects(subject2);
//        author.addSubjects(subject3);
//
//        //manyToOne bidirectional code set author
//        book1.setAuthor(author);
//        book2.setAuthor(author);
//
//        repository.save(author);
//
//    }

//    public void createAuthorBook(){
//        Author author=new Author();
//
//        Address addr=new Address();
//        author.setName("akankshatyagi");
//        //address fields
//        addr.setStreetNumber("B-24");
//        addr.setLocation("sadiq nagar");
//        addr.setState("Delhi");
//
//        //subjects
//        Subject subject1=new Subject();
//        subject1.setSubjectName("Java Core");
//        Subject subject2= new Subject();
//        subject2.setSubjectName("JavaScript");
//        Subject subject3=new Subject();
//        subject3.setSubjectName("React JS");
//
//        Book book=new Book();
//        book.setBookName("Effective Java: Volume-1");
//
        //adding addr,subjects,books
//        author.setAddress(addr);
//        author.setBook(book);
//        author.addSubjects(subject1);
//        author.addSubjects(subject2);
//        author.addSubjects(subject3);
//
//        book.setAuthor(author);
//        repository.save(author);
//
//    }
}
