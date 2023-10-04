package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        System.out.printf("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt(); //score에 들어갈 점수 입력(input)

        //score값이 90점보다 같거나 크면 A
        //score값이 80점보다 같거나 크면 B
        //score값이 70점보다 같거나 크면 C
        // 나머지는 D학점

        if (score >= 90) {
            System.out.printf("A");
        } else if (score >=80) {
            System.out.printf("B");
        } else if (score >=70) {
            System.out.printf("C");
        } else {
            System.out.printf("D");
        }

    }
}
