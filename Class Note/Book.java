package com.company;
import java.util.Date;
public class Book extends Library {

    private boolean isRequested;

    public Book(String t, String a, String n, Date d, boolean f, boolean r) {
        super(t, a, n, d, f);
        this.isRequested = r;
    }

    public void print() {
        System.out.println("Title: " + Title
                + "\nAuthor: " + author_artist + "\nItem ID: " + code );
        if (onLoan) {
            System.out.println(Title + " is on loan");
        } else {
            System.out.println(Title + " is not on loan");
        }
        System.out.println("The due date is "+date);
        if (isRequested) {
            System.out.println("The book is requested by others.");
        } else {
            System.out.println("The book is not requested by others.");
        }
        System.out.println();
    }


}
