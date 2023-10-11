package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int count = 0;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            int rval = (int) (Math.random() * 10);
            numArr[i] = rval;
            // numArr[i] =(int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < numArr.length; i++) {
            int val = numArr[i];
            cntArr[val]++;
            //cntArr[numArr[i]]++;

            // int i = 0; i < numArr; i++
           /* for (int rrr : numArr) {
                cntArr[rrr]++;

                System.out.println(rrr);
            } 포이치 */


            System.out.println(Arrays.toString(cntArr));

        }
    }
}

