package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_my {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("성별을 입력해주세요");
        String gender = scan.nextLine();
        System.out.println("키를 입력해 주세요");
        int height = scan.nextInt();

        if ("남자".equals(gender)) {

            if (height > 170) {
                System.out.printf("%dcm는 평균 초과입니다.", height);
            } else if (height < 170) {
                System.out.printf("%dcm는 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 평균입니다.", height);
            }

        } else {

            if (height > 170) {
                System.out.printf("%dcm는 여자평균 초과입니다.", height);
            } else if (height < 146){
                System.out.printf("%dcm는 여자평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 여자평균입니다.", height);
            }

        }
    }
}