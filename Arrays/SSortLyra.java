package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/11/15
A Selection Sort algorithm.
@param a: An unsorted array to be sorted.
*/
import java.util.Arrays;
public class SSortLyra {
    public static void SSt(int[]a){
       for (int i=0; i<a.length-1; i++){
           int min = i;
           for (int j=i+1; j<a.length; j++){
               if (a[j]<a[min]){
                   min = j;
               }
           }
        int t = a[i];
        a[i] = a[min];
        a[min] = t;
       }
    }
    public static void main(String[] args) {
        int[]n = {5, 23, 1, 19, 4, 7};
        SSt(n);
        System.out.println(Arrays.toString(n));
    }
}
