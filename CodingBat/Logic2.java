package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/10/24
This program contains each function of logic 2.
*/
public class Logic2 {
    public static boolean makeBricks(int small, int big, int goal) {
        if ((small*1+big*5>=goal)&&(small>=(goal%5)))
            return true;
        else
            return false;
    }
    public static int loneSum(int a, int b, int c) {
        if (a==b && b==c) return 0;
        else if (a==c) return b;
        else if (b==c) return a;
        else if (a==b) return c;
        else return a+b+c;
    }

    public static int luckySum(int a, int b, int c) {
        if (a==13) return 0;
        else if (b==13) return a;
        else if (c==13) return a+b;
        else return a+b+c;
    }

    public static int FixTeen(int n){
        if (n>=13 && n<=19 && n!=15 && n!=16) return 0;
        else return n;
    }
    public static int noTeenSum(int a, int b, int c) {
        a=FixTeen(a);
        b=FixTeen(b);
        c=FixTeen(c);
        return a+b+c;
    }

    public static int round10(int n){
        if (n%10>=5) return (n/10+1)*10;
        else return (n/10*10);
    }
    public static int roundSum(int a, int b, int c) {
        a=round10(a);
        b=round10(b);
        c=round10(c);
        return a+b+c;
    }

    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(b-a)>=2 && Math.abs(b-c)>=2 && Math.abs(c-a)<=1) return true;
        else if (Math.abs(b-a)<=1 && Math.abs(c-a)>=2 && Math.abs(c-b)>=2) return true;
        else return false;
    }
    public static int blackjack(int a, int b) {
        if (a>21 && b>21) return 0;
        else if (a>21) return b;
        else if (b>21) return a;
        else if (b>a) return b;
        else return a;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if (Math.abs(a-b)==Math.abs(b-c)) return true;
        else if (Math.abs(a-b)==2*Math.abs(b-c) && a!=4*c) return true;
        else if (2*Math.abs(a-b)==Math.abs(b-c) && c!=4*a) return true;
        else return false;
    }

    public static int makeChocolate(int small, int big, int goal) {
        if (goal>small+5*big || goal%5>small) return -1;
        if (goal/5>=big) return goal-5*big;
        else return goal%5;
    }
}
