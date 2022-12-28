package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){
        int total_amount = 0, money = 0, notes;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to be checked : ");
        total_amount = scan.nextInt();
        while(total_amount != 0) {
            if(total_amount >= 1000)
                money = 1000;
            if(total_amount >= 500 && total_amount < 1000)
                money = 500;
            if(total_amount >= 100 && total_amount < 500)
                money = 100;
            if(total_amount >= 50 && total_amount < 100)
                money = 50;
            if(total_amount >= 10 && total_amount < 50)
                money = 10;
            if(total_amount >= 5 && total_amount < 50)
                money = 5;
            if(total_amount >= 2 && total_amount < 5)
                money = 2;
            if(total_amount == 1)
                money = 1;
            notes = total_amount / money;
            System.out.println("Notes used = " + money);
            System.out.println("Number of notes used = " + notes);
            total_amount %= money;
        }
    }
}
