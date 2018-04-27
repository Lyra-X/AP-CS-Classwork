package com.company;

public class MultPractice /*implements StudyPractice*/{
    private int n1;
    private int n2;
    public MultPractice(int N1, int N2){
        n1 = N1;
        n2 = N2;
    }
    public String getProblem(){
        return n1 + " TIMES " + n2;
    }
    public void nextProblem(){
        n2++;
    }
}

