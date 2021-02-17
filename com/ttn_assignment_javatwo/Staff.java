package com.ttn_assignment_javatwo;
import java.util.*;
class Staff extends User {
    String department;
    Scanner in=new Scanner(System.in);
    Librarian lib=new Librarian();
    @Override
    public void checkBookInfo() {}
    @Override
    public void checkAccount() {}
    @Override
    public void reset_password() {
        System.out.println("Enter Username");
        String uname=in.next();
        System.out.println("Enter Current Password");
        String pass=in.next();
        if(this.Username==uname && this.Password==pass)
        {
            System.out.println("Enter New Password");
            String pass_new=in.next();
            System.out.println("Retype New Password");
            String pass_nnew=in.next();
        }
    }
    @Override
    public void show_fine() {
        System.out.println("Enter Name");
        String bookname=in.next();
        System.out.println("Enter Course");
        String course=in.next();
        lib.calculate_fine();
    }
    @Override
    public void request_Book() {
        System.out.println("Enter BookName");
        String bookname=in.next();
        System.out.println("Enter Course");
        String course=in.next();
        lib.issueBook();
    }
    @Override
    public void return_Book() {
        System.out.println("Enter BookName");
        String bookname=in.next();
        System.out.println("Enter Course");
        String course=in.next();
        lib.returnBook();
    }
    @Override
    public void register()
    {
        System.out.println("Enter UserId:");
        this.UserId=in.nextInt();
        System.out.println("Enter Name:");
        this.Username=in.next();
        System.out.println("Enter Password:");
        this.Password=in.next();
        System.out.println("Enter your Department");
        this.department=in.next();
    }
    @Override
    public void login()
    {
        System.out.println("Enter Name:");
        String name=in.next();
        System.out.println("Enter Password:");
        String pass=in.next();
        if(name==this.Username && pass==this.Password)
        {
            System.out.println("Welcome to Home Page");
            char choice;
            do
            {
                System.out.println("Your Menu Here: \n");
                System.out.println("1. View Available Books\n");
                System.out.println("2. View Borrowed Books\n");
                System.out.println("3. View Reserved Books\n");
                System.out.println("4. View Fine Amount");
                System.out.println("5. View Lost Books\n");
                System.out.println("Choose any one : ");
                choice = in.next().charAt(0);
            }while(choice < '1' || choice > '5');
            System.out.println("\n");
            switch(choice)
            {
                case '1' : System.out.println("Available Books:\n");
                    System.out.println("Magazines\n");
                    System.out.println("Journals\n");
                    System.out.println("Course Books");
                    break;
                case '2' : System.out.println("Borowed Books:\n");
                    System.out.println("Let Us C\n");
                    System.out.println("Software Testing");
                    break;
                case '3' : System.out.println("Reserved Books\n");
                    System.out.println("Java\n");
                    break;
                case '4' : System.out.println("Fine Amount:\n");
                    System.out.println("Linux:- 250\n");
                    break;
                case '5' : System.out.println("Lost Books\n");
                    System.out.println("Linux\n");
                    break;
            }
        }
    }
    @Override
    public void logout() {}
}