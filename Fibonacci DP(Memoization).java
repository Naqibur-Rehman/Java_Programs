import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fibMemoized(n, new int[n+1]));

 }

 public static int fibMemoized(int n, int[] qb){
     if(n == 0 || n == 1){
         return n;
     }

     if(qb[n] != 0){
         return qb[n];
     }

     int fibn = fibMemoized(n-1, qb) + fibMemoized(n-2, qb);
     qb[n] = fibn;
     return fibn;

 }

}
