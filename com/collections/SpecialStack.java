package com.collections;
import java.util.Scanner;
import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
    //maintaining min elements
    Stack<Integer> minElements=new Stack<>();
    public void push(int x) {
        if(isEmpty()==true){
            super.push(x); // inserting in original stack class
            minElements.push(x); // min stack
            System.out.println(minElements.peek()+" is pushed.");
        }
        else{  //poppint the top ele from min stack
            super.push(x);
            int  temp=minElements.pop();
            //checking whether x < popped item
            if(x<temp) // push x
                minElements.push(x);
            else  //push back the popped item
                minElements.push(temp);
            System.out.println(minElements.peek()+" is pushed.");
        }
    } //push method

    public  Integer pop() {
        int popItem=super.pop(); //pop the item
        int min_pop=minElements.pop();
        if (min_pop != popItem)
            minElements.push(min_pop);
        return popItem;
    }
    int getMin() {
       //to maintain the minelement stack
        if(!minElements.empty())
            return minElements.peek();  // return the popped item
        else  return -999;
    }
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        SpecialStack stack_sp=new SpecialStack();
        System.out.println("Enter the 5 elements:: ");
        for(int i=0;i<5;i++) {
            stack_sp.push(input.nextInt());
        }
        //System.out.println("The popped item: "+stack_sp.pop());
        System.out.println("The Min item: "+stack_sp.getMin());
        System.out.println("The popped item is : "+stack_sp.pop());
        stack_sp.push(1);
        System.out.println("The Min item: "+stack_sp.getMin());
    }
}
