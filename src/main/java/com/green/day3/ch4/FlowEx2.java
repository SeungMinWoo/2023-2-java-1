package com.green.day3.ch4;

/*
    Scanner
    if
    parsing
 */

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        // (콘솔)숫자를 하나 입력하세요 >
        // (입력 기다려야 함)
        // 숫자를 입력하고 엔터를 누르면
        // String 변수에 해당값이 저장될 수 있도록
        // 해당 문자열을 > 정수형으로 형변환
        // 해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        //해당 숫자가 0이 아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다."

        Scanner scan = new Scanner(System.in); // 1. scanner 객체 생성
        System.out.println("숫자를 하나 입력하세요."); // 2. 출력문(print) 생성
        String text = scan.nextLine(); // 3. scan input 생성. 'scan.nextLine'이 되는 순간 콘솔은 입력을 기다림.
        int x = Integer.parseInt(text); // 4. 변수 정의, 입력값 정수변환 선언(Integer.paraseInt=메소드). >input에서 String이었으므로

        if(x==0){System.out.println("입력하신 숫자는 " + x +"입니다"); // 5. if 변수문 조건1
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다");
            System.out.println("입력하신 숫자는 " + x +"입니다");
        }

    }
}
