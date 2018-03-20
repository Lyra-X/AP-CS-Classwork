package com.company;

public class Lesson {
    String lTitle;
    int durationMin;
    boolean requireLab;
    public Lesson(){
        lTitle = "";
        durationMin = 40;
        requireLab = false;
    }
    public Lesson(String ltitle, int duration, boolean r){
        lTitle = ltitle;
        durationMin = duration;
        requireLab = r;
    }
    public void print(){
        System.out.println("Lesson Title: "+lTitle+"\nDuration: "+durationMin+"\nLab Requirement: "+requireLab);
    }
}
