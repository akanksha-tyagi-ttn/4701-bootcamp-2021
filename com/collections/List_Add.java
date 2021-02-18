package com.collections;
import java.util.*;

public class List_Add {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        List<Float> floatList=new ArrayList<Float>();
        insertElementsInList(floatList);
        addElementsOfList(floatList);
    }

    static void insertElementsInList(List<Float> list) {
        System.out.println("Enter the 5 floating points numbers:: ");
        for(int i=0;i<5;i++) {
            list.add(input.nextFloat());
        }
    }
    static void addElementsOfList(List<Float> floatList) {
        Iterator<Float> iterator_float=floatList.iterator();
        float result=0.0f;
        while(iterator_float.hasNext()) {
            result+=iterator_float.next();
        }
        System.out.printf("The result is: %.2f",result);
    }
}

