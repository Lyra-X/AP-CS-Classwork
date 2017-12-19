package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/10/24
This program uses a recursive method to print a love letter n times and sign off one time after this.
The times (n) depends on the number user input.
*/

import java.util.Scanner;

public class FMNLyra {
    public static String forU(int n){

        if (n==1)
            ;
        else {
            System.out.println("I miss u dearly, from the world's farthest distance, 1256km away.");
            System.out.println("U r my perpetual glory, the silhouette lingering in my cloistered dreams.");
            System.out.println("My fantastic fantasy, my melodious anthem.");
            System.out.println("The one I'm willing to share my whole life & afterlife with.");
            System.out.println("Whom I wish to have mentally, physically, and legitimately.");
            System.out.println("U make me wanna drive overnight, hold u under the neon light.");
            System.out.println("By the dawn take a flight, escaping the world with delight.");
            return (forU(n - 1));
        }
        return "Sincerely love, L.";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Times: ");
        int n = input.nextInt();
        System.out.println("To my potential field: ");
         System.out.println(forU(n));
     }
 }
