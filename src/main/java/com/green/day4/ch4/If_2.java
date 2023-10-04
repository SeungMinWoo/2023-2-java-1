package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        //Scanner를 이용하여 성별을 입력 (남자,남,man, Man,  여자,여,woman, Woman)
        //만약에 남자가 입력되었다면 콘솔에 "잘 생겼다." 출력
        //만약에 여자가 입력되었다면 콘솔에 "예쁘다."출력

        Scanner scan = new Scanner(System.in);
        System.out.printf("성별을 입력해 주세요");
        String a = scan.nextLine();
        String b = "누구냐";

        if ("남자".equals(a)
            || "남".equals(a)
            || "man".equals(a)
            || "Man".equals(a)) {
            b = "잘생겼다";
        } else if ("여자".equals(a)
                || "여".equals(a)
                || "woman".equals(a)
                || "Woman".equals(a)) {
            b = "예쁘다";
        }
        System.out.printf(b);
    }
}