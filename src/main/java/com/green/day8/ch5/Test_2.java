package com.green.day8.ch5;

public class Test_2 {
    public static void main(String[] args) {
        int[] arr =new int[10];
        for (int i = 0; i < arr.length ; i++) {
            int rindx=(int)(Math.random()*arr.length);
            if (i==rindx){continue;}
                int tmp= arr[i];
                arr[i]=arr[rindx];
                arr[rindx]=tmp;
            }

        }
    }

