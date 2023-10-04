package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.printf("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt(); //score에 들어갈 점수 입력(input)
        String grade = "C";
        String opt = "";

        if (score >= 90) { //A
            grade = "A";

            } else if (score >= 80) {
            grade = "B";
        }

        if (score >= 80) { //80이상일때만 a,b학점이므로 +,-결정하므로 >=80조건
            if(score % 10 >= 8 || score ==100){ //or연산
                opt = "+";
            } else if (score %10 <= 3) {
                opt = "-";
                }
        System.out.printf("학점은 %s%s\n", grade, opt);
        }
    }
}