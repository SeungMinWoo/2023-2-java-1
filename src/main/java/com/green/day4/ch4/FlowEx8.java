package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 1.scan 객체 생성
        System.out.printf("당신의 주민번호를 입력하세요. (011231-1111222) >>"); // 2. print 출력
        String num = scan.nextLine(); // 3. scanline 생성
        char result = num.charAt(7); // 4. charAt

        switch (result) { //switch는 boolean 및 실수 NO. 문자, 문자열, 정수 OK
            case '1', '3': //char에 맞게 형변환으로 맞춰줌
                System.out.printf("남자입니다.");
                break;
            case '2', '4':
                System.out.printf("여자입니다");
                break;
            default:
                System.out.printf("유효하지 않은 번호입니다");
        }
        // swit
        // 주민등록번호 입력 받으시고,
        // 주민번호를 확인하시고 > 여자인지 남자인지, 유효하지 않은 주민등록번호인지 출력. (1,3남자 2,4 여자)
    }
}
