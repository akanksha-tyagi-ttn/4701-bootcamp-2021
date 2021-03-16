package com.jvmbootcamp.jpahibernate3.entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;

    //many to many
    //provide the name of the field, which maps the relationship
    //provided by author
    // same as the attribute in Author table
    @ManyToMany(mappedBy = "bookList")
    private List<Author> authorList;

    public List<Author> getAuthors() {
        return authorList;
    }

    public void setAuthors(List<Author> authors) {
        this.authorList = authors;
    }
    //in manyToOne unidirectional, no need to have following code
    //many to one bidirectional
//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    Author author;
//
//    public Author getAuthor() {
//        return author; }
//    public void setAuthor(Author author) {
//        this.author = author; }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

}
