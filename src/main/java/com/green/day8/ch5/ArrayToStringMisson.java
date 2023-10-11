package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMisson {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3};
        System.out.println(Arrays.toString(arr));

        int comalen = arr.length - 1;
        System.out.println("-----");
        for (int i = 0; i < arr.length; i++) {
            if (i < comalen) {
                System.out.printf("%d", arr[i] );
            } else {
                System.out.printf("%d", arr[i]);
            }
        }

        System.out.println("-----");
        for (int i = 0; i < arr.length; i++) {
                System.out.print(i<comalen?arr[i]+",":arr[i]);
            }
                System.out.print("\n");
            }
        }
