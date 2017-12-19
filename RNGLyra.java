package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/10/18
This program random generates an integer between 0 & 9 for 10000 times.
Then it counts the percentage of times each number is generated and prints them out.
The ideal case should be 10% for each number.
*/
public class RNGLyra {
    public static void main(String[] args) {

        int rng[]=new int[10];
        for(int i = 0; i<10000000; i++)
        {
            int a = (int)(Math.random()*10);
                rng[a]++;
        }
        for(int i = 0; i<10; i++)
            System.out.println("% of " + i + " is " + (double)rng[i]/100000);
    }
}
