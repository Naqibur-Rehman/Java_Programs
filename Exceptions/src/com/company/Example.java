package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e);
            System.out.println("Unable to perform division, autopilot shutting down");
        }

    }

    public static int divide(){
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x +", y is " + y);
            return x / y;
//        }catch (NoSuchElementException e){
//            throw new NoSuchElementException("No suitable input");
//        } catch (ArithmeticException e){
//            throw new ArithmeticException("Attempt to divide by zero");
//        }

    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while (true){
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e){
                // go round again, read past the end of line in the input first
                scanner.nextLine();
                System.out.println("Please enter a number only the digits 0 to 9");
            }
        }
    }
}
