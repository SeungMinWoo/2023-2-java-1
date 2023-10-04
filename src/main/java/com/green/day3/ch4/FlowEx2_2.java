package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args) {
        // (콘솔)숫자를 하나 입력하세요 >
        // (입력 기다려야 함)
        // 숫자를 입력하고 엔터를 누르면
        // (타입자유) 변수에 해당값이 저장될 수 있도록
        // 해당값이 홀수면
        //00은 홀수입니다.
        //해당값이 짝수면
        //00은 짝수입니다.

        //예를 입력을 8로 했다
        // 8은 짝수입니다
        //입력을 17로 했다.
        //17은 홀수입니다.

        Scanner scan = new Scanner(System.in); // 1. scanner 객체 생성
        System.out.printf("숫자를 하나 입력하세요."); // 2. 출력문(print) 생성
        int num = scan.nextInt(); // 즉시 int형, 정수변환선언 필요없음


        if (num % 2 == 0) {
            System.out.printf(num + " 는 짝수입니다.");
        } else {
            System.out.printf(num + " 는 홀수입니다");
        }
        }
    }
