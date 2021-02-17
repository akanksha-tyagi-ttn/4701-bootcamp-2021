package com.ttn_assignment_javatwo;
class SingletonExample
{
    private static SingletonExample singletonObj;  // static instance
    private SingletonExample()
    {
        System.out.println("instance created once only....!!");
    }

    public static SingletonExample getInstance()
    {
        if(singletonObj==null)
        {
            singletonObj=new SingletonExample();
            return singletonObj;
        }
        return singletonObj;
    }
}
 public class Singleton_Main
 {
     public static void main(String[] args)
     {
         //object 1
         System.out.println("First object of Singleton class is created..");
         SingletonExample obj1=SingletonExample.getInstance();
         //object 2
         System.out.println("Second object of Singleton class is created..");
         SingletonExample obj2=SingletonExample.getInstance();
     }
 }