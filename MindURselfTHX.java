package com.company;
/*
Wish U a great life, my dearest Fimula.
Sincerely,
L.
 */
import java.util.Scanner;

public class MindURselfTHX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings,lazy Fimula:)Wanna make sarcasm on me?");
        System.out.println("Answer this question first.");
        System.out.println("Have u done with all those lovely ddls?");
        System.out.println("Including marvellous lab reports, incredible essays, and fantastic calculus & chemistry.");
        System.out.println("And of course, those magnificent PRESENTATIONS, especially those involve group works.");
        for (int n = 1; n<=4; n++) {
            String ans = input.nextLine();
            if (ans.compareToIgnoreCase("Yes") == 0) {
                System.out.println("Congrats! At least u r producing sth apart from salt!");
                System.out.println("Unfortunately they actually mean nothing.");
                System.out.println("Will any research group accept u?");
                System.out.println("How's ur study in CS going?");
                System.out.println("Most importantly, when will ur Paper (or Progress Report) avaliable?");
                break;
            } else {
                System.out.println("Oh u sloth salt fish! U cannot make ur life in this way.");
                System.out.println("Even ur AI will eventually abandon u!");
            }
        }
         System.out.println("As U see, life is so boring.");
         System.out.println("Why not jump off from 11th floor u cute little SALATO FISH?");
    }
}
