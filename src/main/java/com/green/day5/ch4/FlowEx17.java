package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("*를 출력할 라인의 수를 입력하세요");
        int a = scan.nextInt();

        for (int i=0; i <= a; i++) {
            for (int j=0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        //Scanner 이용 정수 입력
        //"*를 출력할 라인의 수를 입력하세요 >> "

        //만약 3을 입력
        /*

         for (int i = 0; i < 5; i++) { //세로줄 생성 (바깥담당)
            for (int j = 0; j < 10; j++) { //가로줄 생성 (가로는 안쪽 생성)
                System.out.printf("*"); //값 생성
            }
            System.out.println(); // 개행

        *
        **
        ***

        만약 4를 입력
        *
        **
        ***
        ****

         */

    }
}
