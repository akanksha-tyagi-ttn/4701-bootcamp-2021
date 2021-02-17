package com.ttn_assignment_javatwo;

public abstract class User implements LibraryManagementSystem{
    int UserId;
    String Username;
    String Password;
    int booksBorrowed;
    int books_reserved;
    int books_lost;
    int books_returned;
    int fine_amount;
    public abstract void show_fine();
    public abstract void reset_password();
    public abstract void checkBookInfo();
    public abstract void checkAccount();
    public abstract void request_Book();
    public abstract void return_Book();
}
