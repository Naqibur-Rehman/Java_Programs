package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Enter number of integers you want to enter: ");
        count = scanner.nextInt();

        int[] array = readIntegers(count);
        System.out.println("Array : " + Arrays.toString(array));

        System.out.println("Minimum element = " + findMin(array));
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter the elements ");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length-1; i++){
            if(min > array[i+1]){
                min = array[i+1];
            }
        }
        return min;
    }
}
