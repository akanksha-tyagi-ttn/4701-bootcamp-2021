package com.collections;
import java.util.*;

public class SortDecreasingFrequency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=input.nextInt();
        Integer[] arrInt=new Integer[size];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<arrInt.length;i++) {
            arrInt[i]=input.nextInt();
        }
        List<Integer> list = Arrays.asList(arrInt);
        System.out.println("The sorted list is: ");
        System.out.print(sortBasedOnFrequencyAndIndex(list));
    }
    static List<Integer> sortBasedOnFrequencyAndIndex(List<Integer> list)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        Collections.sort(list, (n1, n2) ->  {
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);

            if(freq1 != freq2) {
                return freq2 - freq1;
            }
            return list.indexOf(n1) - list.indexOf(n2);
        });
        return list;
    }
}
