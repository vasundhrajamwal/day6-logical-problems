package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        int num1,num2, rev = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        num1 = scan.nextInt();
        while(num1 != 0){
            num2 = num1 % 10;
            rev = (rev * 10) + num2;
            num1 = num1 / 10;
        }
        System.out.println("Reverse Number : " + rev);
    }
}
