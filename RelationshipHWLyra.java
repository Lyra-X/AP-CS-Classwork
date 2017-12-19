//Lyra W. S3C7 Daniel Gunn Sep 26, 2017
//This program determines whether a person is my ideal wife or not via “if” statement by inputting several conditions.

package javaapplication4;
import java.util.Scanner;

/**
 *
 * @author Du
 */
public class RelationshipHWLyra {
     public static void main(String[] args) {



Scanner input = new Scanner (System.in);
System.out.print("Initials of Chinese Name: ");
String name = input.nextLine();
System.out.print("Height and weight: ");
String hw = input.nextLine();
System.out.print("Interests: ");
String i = input.nextLine();
System.out.print("Years of learning CS: ");
int yrs = input.nextInt();
System.out.print("Personality Type: ");
String type = input.nextLine();


if (name.compareTo("XFJ") == 0)
System.out.println("You definitely fit me well");
else
System.out.println("Goodbye name");
if (hw.compareTo("170-45") == 0)
System.out.println("You definitely fit me well");
else
System.out.println("Goodbye name");
if (i.compareTo("Physics and Visual Art") == 0)
System.out.println("You definitely fit me well");
else
System.out.println("Goodbye name");
if (yrs >= 7)
System.out.println("You definitely fit me well");
else
System.out.println("Goodbye name");
if (type.compareTo("IJ-T") == 0);
else
System.out.println("Goodbye name");

}
}
