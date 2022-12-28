package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
     int num1 = 0, num2 = 0, num3 = 1, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n =  scan.nextInt();
        for(int i =1; i <=n ; i++){
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            System.out.println(num1 + " ");
        }
    }
}
