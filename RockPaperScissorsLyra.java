package com.company;

// Lyra W. S3C7 Daniel Gunn  Sep 20,2017.
// This program allows user to play "Rock,paper,scissors" with computer.
//Users input 1(rock), 2 (paper), 3 (scissors) and the computer choose an answer randomly, then determine who wins.

import java.util.Scanner;
public class RockPaperScissorsLyra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Choice:");
        int choice = input.nextInt();

	 double computer = (int)(3*Math.random());
	 String result = "and";

	 if(computer == choice){
       result = "Tie";
     } else if (choice == 1){
	     if (computer == 2){
	         result = "Computer wins";
         }else {
	         result = "You win!";
         }}else if (choice == 2){
	         if (computer == 1){
	             result = "You win!";
             } else {
	             result = "Computer wins";
             } }else if (choice == 3){
	             if (computer == 1){
	                 result = "Computer wins";
                 }else {
	                 result = "You win!";
                 }
             }
             System.out.println("result:" + result);
         }

     }


