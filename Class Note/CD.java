package com.company;
import java.util.Date;
public class CD extends Library {

    private String gengre;

    public CD(String t, String a, String n, Date d, boolean f, String gengre) {
        super(t, a, n, d, f);
        this.gengre = gengre;
    }
    public void print() {
        System.out.println ("Title: "+Title +
                "\nArtist: " + author_artist + "\nItem ID: " + code );
        if(onLoan)
            System.out.println(Title+" is on loan");
        else
            System.out.println(Title+" is not on loan");
        System.out.println("The due date is "+date);
        System.out.println("Gengre: "+gengre);
        System.out.println();
    }
}
