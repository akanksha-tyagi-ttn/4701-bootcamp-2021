package com.Java_8;
interface Interface_StaticDefaultMethod {
    public static void staticMethod() {
        System.out.println("Static Method's print\n");
    }
    public default void defaultMethod() {
        System.out.println("Default Method's print in interface\n");
    }
}
public class Default_Static_Q6 implements Interface_StaticDefaultMethod{

    public static void main(String[] args)
    {
        System.out.print("accessing static method of interface:\n");
        Interface_StaticDefaultMethod.staticMethod();

        System.out.print("accessing default method of interface:\n");
        Default_Static_Q6 obj=new Default_Static_Q6();
        obj.defaultMethod();
    }
}


/*public static void staticMethod() {
        System.out.println("Static Method's print in class");
    }
    public void defaultMethod()
    {
        System.out.println("Default Method's print in class");
    } */