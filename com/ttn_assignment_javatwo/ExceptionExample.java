package com.ttn_assignment_javatwo;

public class ExceptionExample
{
    public static  void main(String[] args)
    {
        try
        {
            //Class.forName("NewClassExample");
            Class.forName("com.ttn_assignment_javatwo.TestClass"); // NewClassExample is not any class.
            System.out.println("This will be executed when the class in the " +
                    "parameter exists");
        }
        catch (ClassNotFoundException check)
        {
            System.out.println("This will be executed when the class in the " +
                    "parameter does not exists");
            check.printStackTrace();
        }
    }
}






/* public class ExceptionExample
{
    public static void main(String[] args)
    {
        TestClass test=new TestClass();
        test.greeting();

    }
} */
class TestClass
{
    void greeting()
    {
        System.out.println("testClass found !");
    }
}

