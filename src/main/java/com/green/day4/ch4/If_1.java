package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {

        //Scanner를 이용하여 성별을 입력 (남자, 여자)
        //만약에 남자가 입력되었다면 콘솔에 "잘생겼다" 출력
        //만약에 여자가 입력되었다면 콘솔에 "예쁘다"출력

        Scanner scan = new Scanner(System.in);
        System.out.printf("성별을 입력해주세요");
        String z = scan.nextLine();

        String a = "누구냐";

        if ("남자".equals(z)) {
           a = "잘생겼다";
        } else if ("여자".equals(z)){
           a = "예쁘다";
        }
           System.out.printf(a);
    }
}