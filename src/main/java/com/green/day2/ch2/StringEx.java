package com.green.day2.ch2;

public class StringEx {
    public static void main(String[] args){
        String name = "Ja" + "va"; //대문자시작 참조형 레퍼런스 타입
        System.out.println(name);
        System.out.println("Ja" + "va");
        System.out.println("12" + 10 + 9);
        System.out.println("12" + (10 + 9));
        // 연산이 10+9부터 됨 = 19 소괄호의우선순위가 높음
    }

}
