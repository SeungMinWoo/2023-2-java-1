package com.green.day2.ch2;

public class _05_Primitivetype {
    public static void main(String[] args){
        //논리형
        boolean test = true, test2 = false;

        //문자형 (정수)
        char ch = 'a', ch2 = '가';

        //정수형 (cpu는 한번에 4byte를 처리하므로 int가 적절)
        byte b1 = 1; // 1byte
        short s1 = 10; // 2byte cpu가 4byte를 처리하므로 short를 쓴다고 하여 결국 2번 읽어야하므로 크기가 작다는게 옳은것은 아님
        int i1 = 100; // 4byte
        long l1 = 1000; // 8byte, 은행권이아닌이상

        //실수형
        // float f1 = 10.1; -> 못쓰는 예시.
        float f2 = 10.1f, f3 = 10.1F; // 리터럴을 float 타입으로
        float f4 = (float)10.1; // 강제 형변환 연산 후, 결과값 이동
        double d1 = 10.1; // 8byte

        //변수명 동일한 이름 선언 불가
        float f5 = (float)d1; //뒤에 F를 못 쓰는 경우. d1을 변수명사용할 때 F를 못 붙이므로

    }
}
