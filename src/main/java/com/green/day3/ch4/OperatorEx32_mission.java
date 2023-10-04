package com.green.day3.ch4;

import java.util.Scanner;

public class OperatorEx32_mission {
    public static void main(String[] args) {
        //절.대.값 만들기 (기존 메소드 사용금지)
        //만약에 n이 (음수 아무값)-10이었다면 콘솔에 10이 출력
        //만약에 n이 (양수 아무값)9이었다면 콘솔에 9가 출력
        int n = -10;
        n = n * -1; // 양수로 변환하고 싶을 때 *-1처리
        n = -n; // 혹은 이렇게 사용

        Scanner scan = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요.");
        int num = scan.nextInt();

        if (num>0) {System.out.println(num);
        } else {System.out.println(num*-1);}
    }
}
