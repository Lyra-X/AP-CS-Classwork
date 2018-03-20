package com.company;

public class Courses {
    static String cTitle;
    static int maxStu;
    static int noLessons;

    public static void main(String[] args) {
        Assessment a= new Assessment("whatever", 100);
        System.out.println(a.Title);
        System.out.println(a.maxMarks);

        Lesson l=new Lesson("idk", 60, true);
        System.out.println(l.lTitle);
        System.out.println(l.durationMin);
        System.out.println(l.requireLab);

        System.out.println("Course Title: "+cTitle+"\nMaximum Students: "+maxStu+"\nNo. of Lessons: "+noLessons+
                "\n"Assessment("whatever", 100)+"\n"l);
    }

}
