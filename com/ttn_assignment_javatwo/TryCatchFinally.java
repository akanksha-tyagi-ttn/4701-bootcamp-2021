package com.ttn_assignment_javatwo;
import java.util.Scanner;
public class TryCatchFinally {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = input.nextInt();
        try {
            System.out.println("The result of the division is:  ");
            int[] arr = new int[3];
            arr[4]=numerator/denominator;
            System.out.println(" " + arr[4]);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage()); ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("In finally Block, executed successfully!!");
        }
    }
}
