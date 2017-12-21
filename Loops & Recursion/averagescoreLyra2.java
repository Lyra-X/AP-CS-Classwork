package com.company;

// Lyra W. S3C7 Daniel Gunn  Sep 28,2017.
// This program prints each student's average score after user inputs number of students,assignments, and score of each.
//version 2.0 enables the input verification, which a score above 100 or below 0 will be invalid.

import java.util.Scanner;
public class averagescoreLyra2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("students number:");
        int n = input.nextInt();


        int a = 1;
        int b = 1;
        double total = 0;
        double avr = 0;

        for (a = 1; a <= n; a++) {
            System.out.println("student " + a);
            for (b = 1;; b++) {
                System.out.println("enter assignment score " + b + ": ");
                double grade = input.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    total = total + grade;
                    avr = total /(b);
                    continue;}
                else if (grade == -1)
                    break;
                else
                    System.out.println("Invalid Input");
                   break;

            }System.out.println("average: " + avr);

            total = 0;
            avr = 0;
        }
    }
}





