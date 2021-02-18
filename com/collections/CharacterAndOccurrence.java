package com.collections;
import java.util.*;

public class CharacterAndOccurrence {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the string to test::  ");
        String string=input.nextLine();
        printCharacters_Occurrence(string);
    }
    static void printCharacters_Occurrence(String stringToTest){
        LinkedHashMap<Character, Integer> char_occur = new LinkedHashMap<>();
        for(Character ch : stringToTest.toCharArray()) {
            if(char_occur.containsKey(ch)) {
                char_occur.put(ch, char_occur.get(ch)+1);
            }
            else {
                char_occur.put(ch, 1);
            }
        }
        for(Map.Entry e: char_occur.entrySet()) {
            if(e.getKey().equals(' '))
                System.out.println("space: "+e.getKey() +" occurrence: "+e.getValue());
            System.out.println("character: "+e.getKey() +" occurrence: "+e.getValue());
        }
    }
}
