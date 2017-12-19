package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/11/15
A Merge Sort algorithm.
@param a: An unsorted array to be sorted.
*/
import java.util.Arrays;
public class MSortLyra {
    public static void MSt(int[]a) {
        if (a.length == 1)
            return;
        int u[] = new int[a.length/2];
        int l[] = new int[(a.length+1)/2];
        int ui=0;
        int li=0;
        for (int i=0; i<a.length; i++)
            if (i<(a.length/2))
                u[ui++] = a[i];
            else
                l[li++] = a[i];
            MSt(u);
            MSt(l);
        ui = 0;
        li = 0;
        for (int i=0; i<a.length; i++) {
            if (ui == u.length)
                a[i] = l[li++];
            else if (li == l.length)
                a[i] = u[ui++];
            else if (u[ui] < l[li])
                    a[i] = u[ui++];
                else
                    a[i] = l[li++];
            }
        }
    public static void main(String[] args) {
        int[]n = {37, 29, 43, 4, 5, 89, 11};
        //int[]c = Arrays.copyOf(n, n.length);
        MSt(n);
        System.out.println(Arrays.toString(n));
    }
}
