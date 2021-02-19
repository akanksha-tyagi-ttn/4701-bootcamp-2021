package com.Java_8;
interface Interface_DefaultMethod_q8 {
    default void defaultMethod() {
        System.out.println("Default Method's print in interface\n");
    }
}
class InheritInterface_1 implements Interface_DefaultMethod_q8
{
    @Override
    public void defaultMethod() {
        System.out.println("Default Method's print in InheritInterface_1");
    }
}

class InheritInterface_2 implements Interface_DefaultMethod_q8 {
    @Override
    public void defaultMethod() {
        System.out.println("Default Method's print in InheritInterface_2");
    }
}

public class DefaultMultipleInheritance_q8 {
    public static void main(String[] args)
    {
        System.out.print("accessing default method of interface:\n");
        InheritInterface_1 obj=new InheritInterface_1();
        obj.defaultMethod();
    }
}
