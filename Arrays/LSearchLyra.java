package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/11/14
A linear (sequential) search algorithm.
@param a: A 2D array to search in.
@param v: The value to search for.
@return: The index row & column of the found item.
 */
public class LSearchLyra{
    public static int[] LSrc(int[][]a, int v) {
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 4) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
    public static void main(String[] args) {
        int[][]a = {{1,5},{2,3,22,4,7}};
        int result[]=LSrc(a,4);
        System.out.println(result[0]);
        System.out.println(result[0]);
    }
}
