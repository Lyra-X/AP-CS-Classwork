package com.company;

import java.util.Date;

public class Library {
    String Title;
    String author_artist;
    String code;
    Date date;
    boolean onLoan;
    public Library(String t, String a, String n, Date d, boolean f){
        Title = t;
        author_artist = a;
        code = n;
        date = d;
        onLoan = f;
    }
    public void print() {
        System.out.println ("\nTitle: "+Title +
                "\nAuthor/artist: " + author_artist + "\nItem ID: " + code );
        if(onLoan)
            System.out.println(Title+" is on loan");
        else
            System.out.println(Title+" is not on loan");
    }
}
