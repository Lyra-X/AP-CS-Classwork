package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/10/11
This "Make-your-owm-adventure" game is associated with a novella (or game script) written by myself.
This program is a tiny component of this game (called "Wonderland").
It serves as an access control, which prevents player from entering the house unless
player has nswered the question correctly.
More complicated puzzles are coming after this.
Player will has three chances to answer, then player will be killed by arrows or
poisonous smog beneath the wall for security purpose after a satiric "parting words".
Contact me if you wish to know more detail about the whole story.
The 2.0 version has fixed some bugs in version 1.0, no return value casting because it's unnecessary.
 */

import java.util.Scanner;
public class WGameLyra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings,homo sapiens:)I know u desire to enter this place.");
        System.out.println("Answer a simple question, then I'll let u in.");
        System.out.println("Restricts to two words, my lovey computer hates redundant stuffs.");
        System.out.println("Why is a void space always silent?");
        System.out.println("Because it's: ");
        int n;
        boolean ansflag=false;
        for (n = 1; n<=3; n++){
            String ans = input.nextLine();
            if (ans.compareToIgnoreCase("reserved word")==0) {
                System.out.println("Transit Permitted.");
                ansflag = true;
                break;
            }
            else {
                System.out.println("Invalid Input, Featherbrain.");
            }
        }
        if (ansflag == false)
        System.out.println("Pleasant Journey to Hell:)");
    }
}
