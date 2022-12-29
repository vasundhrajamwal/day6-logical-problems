package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        int decimal = 0, num = 0, binaryNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        binaryNum = scan.nextInt();
        while(true){
            if(binaryNum == 0){
                break;
            }
            else {
                int temp = binaryNum % 10;
                decimal += temp * Math.pow(2, num);
                binaryNum = binaryNum / 10;
                num ++;
            }
        }
        System.out.println("Decimal Number is : " + decimal);
        }
    }
