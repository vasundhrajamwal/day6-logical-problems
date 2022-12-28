package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int num, prime = 0, flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = scan.nextInt();
        prime = num / 2;
        if(num == 0 || num == 1){
            System.out.println(num + " is not a prime number");
        }
        else{
            for(int i = 2; i <= prime; i++){
                if(num % i == 0){
                    System.out.println(num + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(num + " is a prime number");
            }
        }
    }
}
