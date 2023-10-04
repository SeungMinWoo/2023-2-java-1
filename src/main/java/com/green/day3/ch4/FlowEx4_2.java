package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4_2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.printf("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        char grade = 'D';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >=70) {
            grade = 'C';
        }
        System.out.printf("%c학점\n", grade); //기본값을 char D로 줌. 위의 if애들은 조건을 주어 결과값 반환

        //score값이 90점보다 같거나 크면 A
        //score값이 80점보다 같거나 크면 B
        //score값이 70점보다 같거나 크면 C
        // 나머지는 D학점

    }
}
