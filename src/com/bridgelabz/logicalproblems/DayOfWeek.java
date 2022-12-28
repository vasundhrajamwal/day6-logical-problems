package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int day, month, year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day : ");
        day = scan.nextInt();
        System.out.println("Enter the month : ");
        month = scan.nextInt();
        System.out.println("Enter the year : ");
        year = scan.nextInt();
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y /400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + ( 31 * m) / 12) % 7;
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        System.out.println("DD:" + day + " MM:" + month + " YY:" + year);
    }
}
