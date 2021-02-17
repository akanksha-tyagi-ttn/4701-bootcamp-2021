package com.ttn_assignment_javatwo;
import java.util.Scanner;

public class Librarian implements LibraryManagementSystem
{
    Scanner in=new Scanner(System.in);
    User stu1=new Student();
    Book book=new Book();
    int Id;
    String name;
    String password;
    @Override
    public void register()
    {
        System.out.println("Enter UserId:");
        this.Id=in.nextInt();
        System.out.println("Enter Name:");
        this.name=in.next();
        System.out.println("Enter Password:");
        this.password=in.next();
    }
    @Override
    public void login()
    {
        System.out.println("Enter Name:");
        String name=in.next();
        System.out.println("Enter Password:");
        String pass=in.next();
        if(name.equals(this.name) && pass.equals(this.password))
        {
            System.out.println("Welcome to Home Page");
            char choice;
            do
            {
                System.out.println("Your Menu Here: \n");
                System.out.println("1. Issue Books\n");
                System.out.println("2. View Books\n");
                System.out.println("3. Return Books\n");
                System.out.println("4. View Users\n");
                System.out.println("5. Add Student\n");
                System.out.println("6. Remove Student\n");
                System.out.println("7. Calculate Fine Amount");
                System.out.println("8. Verify Members\n");
                System.out.println("9. Generate Bill\n");
                System.out.println("Choose any one : ");
                choice = in.next().charAt(0);
            }while(choice < '1' || choice > '9');
            System.out.println("\n");
            switch(choice)
            {
                case '1' :issueBook();
                    break;
                case '2' : view_books();
                    break;
                case '3' : returnBook();
                    break;
                case '4' : view_Users();
                    break;
                case '5' : addStudent();
                    break;
                case '6' : remove_student();
                    break;
                case '7' : calculate_fine();
                    break;
                case '8' : verifyMembers();
                    break;
                case '9' : generateBill();
                    break;
            }
        }
    }
    @Override
    public void logout() {}
    public void verifyMembers(){}
    public void view_books(){}
    public void view_Users(){}
    public void issueBook()
    {
        System.out.println("Enter Book Id:");
        int bId=in.nextInt();
        System.out.println("Enter Book Name:");
        String bname=in.next();
        System.out.println("Enter dueDate:");
        String duedate=in.next();
    }
    public void returnBook()
    {
        System.out.println("Enter Book Id:");
        int bId=in.nextInt();
        System.out.println("Enter Book Name:");
        String bname=in.next();
    }
    public void addStudent()
    {
        stu1.register();
    }
    public void remove_student(){}
    public void calculate_fine(){}
    public void generateBill(){}
}

