package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;

//        while(true){
        while (count < 10){
            System.out.println("Enter number #" + (count + 1) + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
//                if (count == 10){
//                    break;
//                }
            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of 10 number is: " + sum);

        scanner.close();

    }
}
