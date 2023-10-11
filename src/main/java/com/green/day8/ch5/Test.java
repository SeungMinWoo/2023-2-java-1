package com.green.day8.ch5;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

      int[] a= new int[10];
        for (int i = 0; i <a.length ; i++) {
           a[i]=(int) (Math.random()*10)+1;



        }
        System.out.println(Arrays.toString(a));
        }
    }

