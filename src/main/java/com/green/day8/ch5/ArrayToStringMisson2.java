package com.green.day8.ch5;
import java.util.Arrays;
public class ArrayToStringMisson2 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3};
        System.out.println(Arrays.toString(arr));

        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i]);

            if (i< arr.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }
}
