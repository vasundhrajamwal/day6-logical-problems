package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num, sum = 0;
        System.out.println("Enter the number : ");
        num = scan.nextLong();
        int i = 1;
        while (i <= num / 2) {
            {
                if (num % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
        }
            if (sum == num) {
                System.out.println(num + " is a perfect number");
            } else
                System.out.println(num + " is not a perfect number");
    }
}
