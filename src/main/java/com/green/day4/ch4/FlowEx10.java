package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("당신의 점수를 입력하세요. (1~100)>>");
        String tmp = scan.nextLine();
        int score = Integer.parseInt(tmp);

        switch (score / 10){
            case 9,10 :
                System.out.printf("당신의 학점은 A입니다");
                break;
            case 8:
                System.out.printf("당신의 학점은 B입니다");
                break;
            case 7:
                System.out.printf("당신의 학점은 C입니다");
                break;
            default:
                System.out.printf("당신의 학점은 F입니다.");
        }
        //swich를 사용
        //90점 이상은 "당신의 학점은 A입니다.
        //80점 이상은 "당신의 학점은 B입니다.
        //70점 이상은 "당신의 학점은 C입니다.
        //당신의 학점은 F입니다.
    }
}
