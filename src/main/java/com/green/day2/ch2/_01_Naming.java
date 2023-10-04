package com.green.day2.ch2;

public class _01_Naming {
        public static void main(String[] args){
            /*
            1. 대소문자 구별. 길이제한 X
             1) int abc, aBc, abC, aaaaaaaaaaaa;

            2. 이름으로 예약어 사용 X
             1) int int, void, static;

            3. 숫자 시작 X (처음만 아니면 됨)
             1) int 1ab;

            4. 특수문자는 _, $만 가능
             1) int _ab, $ab; 가능

             ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

            #케이스기법  (1,2번 중요)
            1. 파스칼 케이스 기법 > 대문자로 시작
             -> HelloMyNameIsHong

            2. 카멜 케이스 기법(변수명, 메소드명) > 소문자로 시작, 모양이 낙타같아서 카멜이 됨
             -> helloMyNameIsHong

            3. 케밥 케이스 기법 > css에서 주로 쓰는 기법, java 없음(하이픈을 사용하지 못하므로)
             -> hello-my-name-is-hong

            4. 스네이크 케이스 기법
             -> hello_my_name_is_hong

             ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

            #상수는 전부 대문자 (구분은 언더바)
            1. PI, MAX_NUMBER
             -> final int PI = 0, MAX_NUMBER = 10; // final붙은게 java에선 상수

            2. Data today = new Data();
             -> D가 대문자라 참조형(reference)
             */
        }
}
