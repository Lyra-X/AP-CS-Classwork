package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/10/11
This program serves as a calculator that calculate the number of different types of coins while a total amount is given.
 */
    import java.util.Scanner;
    public class CoinLyra {
        public static void coinChanger(int amount){
            int half = amount/50;
            int re = amount%50;
            int qtr = re/25;
            re = re%25;
            int d = re/10;
            re = re%10;
            int ni = re/5;
            int penny = re%5;
            System.out.println("Half Dollar: " + half);
            System.out.println("Quarter: " + qtr);
            System.out.println("Dime: " + d);
            System.out.println("Nickel: " + ni);
            System.out.println("Penny: " + penny);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Amount: ");
            int amount = input.nextInt();
            coinChanger(amount);
    }

}
