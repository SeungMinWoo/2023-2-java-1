package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] arr =new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        // [4, 1, 2, 3, 0, 5, 6, 7, 8, 9]

        for (int i = 0; i < arr.length; i++) {

           int ridx =(int)(Math.random()*arr.length);
           // if (i == ridx){continue;}
           int tmp = arr[i];
            arr[i]=arr[ridx]; //arr[4]
            arr[ridx]=tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
