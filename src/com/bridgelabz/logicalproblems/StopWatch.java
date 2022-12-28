package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args){
        double startTime, endTime;
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 0 to start : ");
        startTime = scan.nextDouble();
        startTime = System.currentTimeMillis();
        System.out.println("Press 1 to stop : ");
        endTime = scan.nextDouble();
        endTime = System.currentTimeMillis();
        System.out.println("Elapsed time : " + ((endTime - startTime)  / 1000) + "seconds");
    }
}