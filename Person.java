package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/12/12
The methods/functions for my simulated world project
 */
import java.util.Scanner;
public class Person {
    private String language;//Instance Variable
    private int age;//Instance Variable
    private int time;

    public Person(String language) {//Constructor
        this.language = language;
    }

    public void grow(int yrs) {
        this.age += yrs;
    }
    /*public void setLanguage(String x){
        this.language = x;
    }
    public String getLanguage(String x){
        return this.language;
    }*/
    public String greetings() {
        if (this.age < 1) {
            return ("????");
        } else if (this.age > 7) {
            return ("Greetings, sloth human");
        } else if (this.language.equals("En"))
            return ("Hello I'm " + this.age);
        else if (this.language.equals("Fr"))
            return ("Bonjour je suis " + this.age);
        else if (this.language.equals("It"))
            return ("Ciao");
        else if (this.language.equals("Es"))
            return ("Hola");
        else
            return ("Guten Morgan");
    }

    public String Excluding() {
        if (this.time > 30)
            return ("It's time to leave our simulated world");
        else return ("-v-;");
    }

    public String CharacterDeath() {
        if (this.age > 70) {
            Scanner input = new Scanner(System.in);
            System.out.println("Sorry,This character's life comes to an end,please enter the epitaph:");
            String str = input.nextLine();
            str = "R.I.P  " + str;
            return str;
        }
        return "str";
    }
}

