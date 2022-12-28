package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args){
        int num1 = 0, num2 = 0;
        int distnum = 0, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of Coupons needed : ");
        num1 = scan.nextInt();
        boolean[] coupon = new boolean[num1];
        while(distnum < num1){
            num2 = (int) ((Math.random() * 100) % num1);
            count ++;
            if(coupon[num2] == false){
                distnum ++;
                coupon[num2] = true;
                System.out.println(num2);
            }
        }
        System.out.println("Count : " + count);
    }
}
