package com.company;

public class Assessment {
    String Title;
    int maxMarks;
    public Assessment(){
        Title= "";
        maxMarks = 100;
    }
    public Assessment(String title, int mark){
        this.Title= title;
        this.maxMarks = mark;
    }
    public void print(){
        System.out.println("Assessment Title: "+this.Title+"\nMaximum Mark: "+this.maxMarks);
    }
}
