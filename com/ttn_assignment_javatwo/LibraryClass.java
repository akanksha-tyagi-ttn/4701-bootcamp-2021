package com.ttn_assignment_javatwo;
import java.util.*;
public class LibraryClass {
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("DEBUGGING IS REQUIRED...");
        char choice;
        System.out.println("Welcome to the DashBoard of our Library");
        do
        { System.out.println("Your Menu Here: \n");
            System.out.println("1. Student");
            System.out.println("2. Staff");
            System.out.println("3. Librarian");
            System.out.println("4. Exit");
            System.out.println("Choose any one : ");
            choice = in.next().charAt(0);
        }while(choice < '1' || choice > '4');
        System.out.println("\n");
        switch(choice)
        {
            case '1' : User stu=new Student();
                stu.register();
                stu.login();
                break;
            case '2' : User staff=new Staff();
                staff.register();
                staff.login();
                break;
            case '3' : Librarian lib=new Librarian();
                lib.register();
                lib.login();
                break;
            case '4' : System.exit(0);
                break;
        }
    }
}
