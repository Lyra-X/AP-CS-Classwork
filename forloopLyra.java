package com.company;

// Lyra W. S3C7 Daniel Gunn  Sep 28,2017.
// This program prints "*" in pyramid shape respects to the row user enters with "for" loop.
//version 4.0 enables the input verification, which even number will be invalid.

import java.util.Scanner;
public class forloopLyra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("length of final row:");
        int n=input.nextInt();
        int a;
        int b;
        if (n % 2==1){
            for (a = 1; a <= (n + 1) / 2; ++a)  {
                for (b = 1; b <= (n + 1) / 2-a; ++b)
                    System.out.print(" ");
                    for (b = 1; b <= a*2-1; ++b)
                    System.out.print("*");
                System.out.println();
            }
        }
        else System.out.print("invalid input");
    }

}



