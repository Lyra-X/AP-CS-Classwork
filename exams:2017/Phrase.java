package com.company;

public class Phrase {
    private String currentPhrase;
    public Phrase(String p){
        currentPhrase = p;
    }
    public int findNthOccurrence(String str, int n){
        //implementation not shown
        return 0;//just to pass the compiling
    }
    public void replaceNthOccurrence(String str, int n, String r){
        int l = findNthOccurrence(str, n);
        if(l!=-1){
            currentPhrase = currentPhrase.substring(0, l)+r+currentPhrase.substring(l+str.length());
        }
    }
    public int findLastOccurrence(String str){
        int n=1;
        while(findNthOccurrence(str, n+1)!=-1){
            n++;
        }
        return findNthOccurrence(str, n);
    }
    public String toString(){
        return currentPhrase;
    }
}
