package com.company;
import java.util.*;
public class IntegerSet implements Mergeable{
    public int arr[];
    public int l;
    public IntegerSet(int[]a){
        arr = new int[a.length];
        for(int i=0; i<a.length; i++)
            arr[i] = a[i];
        this.l = arr.length;
    }
    public IntegerSet merge(IntegerSet b){
        int merge[] = new int[this.l+b.l];
        for(int j=0; j<this.l; j++)
            merge[j] = this.arr[j];
        for(int k=this.l; k<merge.length; k++)
            merge[k] = b.arr[k-this.l];
        IntegerSet r = new IntegerSet(merge);
        return r;
    }
    public void print(){
        System.out.println(printArr(this.arr));
    }
    public int length(){
        return this.l;
    }
    public boolean elementsOf(int x){
        for(int i=0; i<arr.length; i++)
            return this.arr[i]==x;
        return false;
    }
    public static String printArr(int[]arr){
        String s = "";
        for(int j=0; j<arr.length; j++)
            s = s + (arr[j]+"");
        return s;
    }
}
