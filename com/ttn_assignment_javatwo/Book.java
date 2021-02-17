package com.ttn_assignment_javatwo;
import java.util.List;
public class Book {
    int BookId;
    String title; String author;
    int ISBN;
    String publication;
    double price;  String BookType;
    List<String> books_list;
    public void displayBookDetails(){}
    public void add_book(){}
    public void delete_book(){}
    public void update_book(){}
    public void search_book(){}
    public void getDueDate(){}
    public void showFeedback(){}
    public void availabilityStatus(){}
}
class Magazines extends Book
{ }
class Journals extends Book
{ }
class StudyBooks extends Book
{ }
