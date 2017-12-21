package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/10/25
This program uses a recursive method to print the words of digits input.
e.g. Input "1 2 3" will result in a output of "one two three".
 */

import java.util.Scanner;

public class NtoWLyra {
    public static String intStr(int n){

        if (n==0)
            return "";
        else if (n%10==0)
            return intStr(n/10)+"zero";
        else if (n%10==1)
            return intStr(n/10)+"one";
        else if (n%10==2)
            return intStr(n/10)+"two";
        else if (n%10==3)
            return intStr(n/10)+"three";
        else if (n%10==4)
            return intStr(n/10)+"four";
        else if (n%10==5)
            return intStr(n/10)+"five";
        else if (n%10==6)
            return intStr(n/10)+"six";
        else if (n%10==7)
            return intStr(n/10)+"seven";
        else if (n%10==8)
            return intStr(n/10)+"eight";
        else if (n%10==9)
            return intStr(n/10)+"nine";
        else
        return intStr(n/10)+intStr(n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Sequence: ");
        int n= input.nextInt();
        System.out.println(intStr(n));
    }
}
