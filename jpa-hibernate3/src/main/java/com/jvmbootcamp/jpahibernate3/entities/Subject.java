package com.jvmbootcamp.jpahibernate3.entities;
import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectId;
    private String subjectName;
    @ManyToOne
    @JoinColumn(name="author_id") //for the attribute in table
    Author author;

    public Integer getSubjectId() { return subjectId; }
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nSubject{" +
                "subjectId=" + subjectId +
                ",subjectName='" + subjectName + '\'' +
                '}';
    }
}
