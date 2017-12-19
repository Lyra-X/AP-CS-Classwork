package com.company;
//Lyra W S3C7 Daniel Gunn 2017/09/27
//This program works as an ATM, while inputting four options (1,2,3,4) will result in different functions.
//The 3.0 version uses “while” loop instead of "if" or ”switch".

import java.util.Scanner;
    public class ATMLyra4 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Welcome!Withdraw Cash:1, Make a deposit:2, Check your balance:3, Exit:4.Enter the number for your transaction: ");
            int option = input.nextInt();

            do{
                switch (option) {
                    case 1: {
                        System.out.print("Amount of Cash: ");
                        double cash = input.nextDouble();
                        if (cash > 2500.25)
                            System.out.println("Not enough money.");
                        else
                            System.out.println("Withdraw succeed!");
                    }
                    break;
                    case 2:
                        System.out.println("Input deposit amount:");
                        break;
                    case 3:
                        System.out.println("$2500.25");
                        break;
                }
                System.out.print("Welcome!Withdraw Cash:1, Make a deposit:2, Check your balance:3, Exit:4.Enter the number for your transaction: ");
                        option = input.nextInt();  }while (option!=4);
            System.out.println("Have a nice day, thanks!");
        }
    }

