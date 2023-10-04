package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.printf("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt(); //score에 들어갈 점수 입력(input)
        String grade = "C";
        String opt = "";

        if (score >= 90) { //A
            grade = "A";
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
        } else if (score >= 80) {
                grade = "B";
                if (score >= 88) {
                    opt = "+";
                } else if (score <= 83) {
                    opt = "-";
                }
                System.out.printf("당신의 학점은 %d%d입니다.\n", grade, opt);
            }
        }
    }
}