package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase(); // . <으로 메소드 호출, 객체접근. 첫 자리는 0부터 시작
        char result = str.charAt(3); //읽을 숫자 기본값 설정

        System.out.println("result1 : " + result); //toUpperCase메소드가 대문자로 모두 변경 해줌
        System.out.println("result2 : " + str.charAt(2)); //toUpperCase메소드가 대문자로 모두 변경 해줌
        System.out.println("result3 : " + str.charAt(6)); //toUpperCase메소드가 대문자로 모두 변경 해줌

    }
}