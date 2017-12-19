/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg27;

import java.util.Scanner;

/**Lyra W S3C7 Daniel Gunn Sep 27, 2017
 * This program prints increment "*" respects to the line user enters with "for" loop.
 *
 * @author Du
 */
public class ForloopLyra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Line:");
        int a;
        int b;
        int c = input.nextInt();
        for (a = 1; a <= c; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
