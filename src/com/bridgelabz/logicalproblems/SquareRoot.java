package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive Integer value ");
        double c = scan.nextDouble();
        double t = c;
        t = ((c / t) + t) / 2;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = ((c / t) + t) / 2;
        }
        System.out.println(t);
    }
}