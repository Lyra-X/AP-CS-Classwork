package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/12/12
The main program for my simulated world project
Person J; A visitor to this world
Person L,A,I,C: Existing person in that world
 */
public class WorldLyra {
    public static void main(String[] args) {
        Person L = new Person("En");
        L.grow(3);
        System.out.println(L.greetings());
        Person A = new Person("Fr");
        A.grow(3);
        A.CharacterDeath();
        System.out.println(A.greetings());
        Person I = new Person("It");
        System.out.println(I.greetings());
        I.CharacterDeath();
        Person C = new Person("Es");
        C.grow(8);
        System.out.println(C.greetings());
        Person J = new Person("En");
        J.Excluding();
    }
}
