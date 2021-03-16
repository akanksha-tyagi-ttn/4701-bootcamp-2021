package com.jvmbootcamp.jpahibernate3.entities;
import javax.persistence.*;
import java.util.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    //all changes on the subjects too
    private List<Subject> subjects;

    //when unidirectional, no mappedBy is required
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="author_id") // foreign key in book table
//    private List<Book> bookList;

      //one to many bidirectional
//    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
//    private List<Book> bookList;

    //many to many
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="author_book",
            joinColumns = @JoinColumn(name="author_ref", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="book_ref", referencedColumnName = "bookId"))
    private List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() { return address; }
    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Subject> getSubjects() {
        return subjects; }
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    // for foreign key in subject
    public void addSubjects(Subject sub){
        if(sub!=null){
            if(subjects==null){
                subjects=new ArrayList<>();
            }
            sub.setAuthor(this);
            subjects.add(sub);
        }
    }

    //    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
//    private Book book;
//
//    public Book getBook() {
//        return book;
//    }
//    public void setBook(Book book) {
//        this.book = book;
//    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",address=" + address +
                ",subjects=" + subjects +
                ",bookList=" + bookList +
                '}';
    }
}
