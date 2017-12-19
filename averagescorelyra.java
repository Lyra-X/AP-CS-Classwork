package com.company;

// Lyra W. S3C7 Daniel Gunn  Sep 28,2017.
// This program prints "*" in pyramid shape respects to the row user enters with "for" loop.
//version 4.0 enables the input verification, which even number will be invalid.

import java.util.Scanner;
public class averagescorelyra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("students number:");
        int n=input.nextInt();
        System.out.print("assignments number:");
        int as=input.nextInt();

       int a = 1;
       int b = 1;
        double total = 0;
        double avr = 0;

            for (a = 1; a <= n; a++)  {
                System.out.println("student " + a);
                for (b = 1; b <= as; b++){
                    System.out.println("enter assignment score " + b + ": ");
                double grade = input.nextDouble();
                total = total + grade;
            }
                avr = total/(b-1);
                System.out.println("average: " + avr);
            }
        }
}




