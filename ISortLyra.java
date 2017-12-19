package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/11/15
An Insertion Sort algorithm.
@param a: An unsorted array to be sorted.
*/
import java.util.Arrays;
public class ISortLyra {
        public static void ISt(int[]a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (a[j] < a[j - 1]) {
                        int t = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = t;
                    }
                }
            }
        }
        public static void main(String[] args) {
        int[]n = {5, 23, 1, 19, 4, 7};
        ISt(n);
        System.out.println(Arrays.toString(n));
    }
}
