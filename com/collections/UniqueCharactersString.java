package com.collections;
import java.util.*;
public class UniqueCharactersString {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the string to test::  ");
        String string=input.nextLine();
        printUniqueCharacters(string);
    }
    static void printUniqueCharacters(String stringToTest){
        LinkedHashMap<Character, Integer> uniqueChar = new LinkedHashMap<>();
        for(Character c : stringToTest.toCharArray()) {
            if(uniqueChar.containsKey(c)) {
                uniqueChar.put(c, uniqueChar.get(c)+1);
            }
            else {
                uniqueChar.put(c, 1);
            }
        }
        int count=0; //selecting those whose value are unique
        for(Map.Entry e: uniqueChar.entrySet()) {
            if((int)e.getValue() == 1)
                count++;
        }
        System.out.println("\nthe number of unique Characters are: "+count);
    }
}
