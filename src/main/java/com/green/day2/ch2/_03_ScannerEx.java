package com.green.day2.ch2;

import java.util.Scanner;

public class _03_ScannerEx {
    public static void main(String[] arge) {
        Scanner scan = new Scanner(System.in); //객체화 과정. 'new scanner'는 객체화용 키워드. scanner은 객체필수!
        System.out.printf("두자리 정수를 하나 입력해주세요 >> ");

        String input = scan.nextLine(); //nextLine 메소드호출, 입력된게 들어감 input으로. scan부분은 변수명과 동일해야됨! '객체.Nextline'
        int num = Integer.parseInt(input); //문자형을 정수로 바꾸고싶을 때 inter.para~ 외우는게 좋음

        System.out.println("입력내용 " + (input+input));
        System.out.printf("num=%d", num);

    }
}
