package com.green.day4.ch4;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 100 ) + 1; // 1~100

        if(val % 2 == 0) {
            System.out.printf("%d는 짝수입니다", val);
        } else {
            System.out.printf("%d는 홀수입니다", val);
        }
        // val값이 홀수면 > "11은(는) 홀수입니다"
        // val값이 12이면 > "12은(는) 짝수입니다."
    }
}
