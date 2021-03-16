package com.jvmbootcamp.jpahibernate3.entities;
import javax.persistence.*;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;

    //in manyToOne unidirectional, no need to have following code
    //many to one bidirectional
    @ManyToOne
    @JoinColumn(name = "author_id")
    Author author;

    public Author getAuthor() {
        return author; }
    public void setAuthor(Author author) {
        this.author = author; }

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

    @Override
    public String toString() {
        return "\nBook{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
