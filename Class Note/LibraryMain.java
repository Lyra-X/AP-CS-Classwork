package com.company;

import java.util.Date;

public class LibraryMain {
    public static void main(String[] args) {
        Library b = new Book("12 Rules for Life","Jordan Peterson", "X123", new Date(),false,true);
        b.print();



        Library cd = new CD("And Justice for all", "Metallica", "X567", new Date(),false,"Metal");
        cd.print();
    }
}