package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/11/14
This program insert values while preserving the order.
*/
import java.util.Scanner;
import java.util.Arrays;
public class Array2DLyra {
    public static boolean insert(int[]a, int count, int v){
        if (count >= a.length)
            return false;
        for (int i=0;i<a.length;i++)
        {
            while(v>a[count])
            {
                count++;
                if(a[count]==0)
                    break;
            }
            for(int j=a.length-1;j>count;j--)
                a[j]=a[j-1];
            a[count]=v;
            System.out.println(Arrays.toString(a));
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,5,7,8,14,15,0,0,0};
        System.out.print("Enter Number: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        insert(array,0,n);
    }
}
