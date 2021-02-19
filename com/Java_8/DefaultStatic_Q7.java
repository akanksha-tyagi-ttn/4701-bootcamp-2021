package com.Java_8;
interface Interface_StaticDefaultMethod_q7 {
    public static void staticMethod() {
        System.out.println("Static Method's print in interface\n");
    }
    public default void defaultMethod() {
        System.out.println("Default Method's print in interface\n");
    }
}
public class DefaultStatic_Q7 implements Interface_StaticDefaultMethod_q7{
    public void defaultMethod()
    {
        System.out.println("Default Method's print in class");
    }
    public static void main(String[] args)
    {
        System.out.print("accessing static method of interface:\n");
        Interface_StaticDefaultMethod.staticMethod();

        System.out.print("accessing default method of interface:\n");
        DefaultStatic_Q7 obj=new DefaultStatic_Q7();
        obj.defaultMethod();
    }
}


/*public static void staticMethod() {
        System.out.println("Static Method's print in class");
    }
     */