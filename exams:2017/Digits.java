package com.company;
import java.util.ArrayList;
public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        if(num==0){
            digitList.add(new Integer(0));
        }
        while (num>0){
            digitList.add(new Integer(num%10));
        }
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++){
            if(digitList.get(i).intValue()<digitList.get(i+1).intValue())
                return true;
        }
            return false;
    }
}

