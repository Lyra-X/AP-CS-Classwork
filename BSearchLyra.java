package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/11/14
A binary search algorithm.
@param a: An 1D array to search in.
@param v: The value to search for.
@return: The index coordinate of the found item.
 */
public class BSearchLyra {
    public static int BSrc(int[]a, int v) {
        int li = 0;
        int ui = a.length-1;
        while (li<=ui){
            int mi = (ui+li)/2;
            if (a[mi]==v){
                return mi;
            }
            else if (a[mi]<v){
                li = mi+1;
            }
            else{
                ui = mi-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]a = {1, 4, 5, 7, 9, 11, 13, 17, 19};
        int result=BSrc(a,17);
        System.out.println(result);
    }
}
