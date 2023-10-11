package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100,88,100,100,90};
        float avg = 0;
        int sum = 0;

        for (int i = 0; i < score.length ; i++) {
            sum=sum+score[i];
            avg=(float)sum/(score.length);

        }
        System.out.println("총점 점수"+sum);
        System.out.println("평균 점수"+avg);
    }
}
