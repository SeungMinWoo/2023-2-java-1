package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6_my {
    public static void main(String[] args) {
        System.out.printf("현재 월을 입력하세요 >> ");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        switch (mon) {
            case 1:
            case 2:
            case 12:
                System.out.println("겨울 입니다");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄 입니다");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다");
                break;
            default:
                System.out.println("가을입니다");
                break;

        /*
        switch문 사용
        mon값이 3~5사이면 "현재의 계절은 봄입니다." 출력
        mon값이 6~8사이면 "현재의 계절은 여름입니다."
        9~11사이면 "현재의 계절은 가을입니다."
        12~2사이면 "현재의 계절은 겨울입니다."

         */


        }
    }
}
