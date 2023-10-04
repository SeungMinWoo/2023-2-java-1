package com.green.day5.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        //중첩 반복문을 사용하여
        //가로 10개, 세로 5줄
        //별을 찍으시오

        for (int i = 0; i < 5; i++) { //세로줄 생성 (바깥담당)
            for (int j = 0; j < 10; j++) { //가로줄 생성 (가로는 안쪽 생성)
                System.out.printf("*"); //값 생성
            }
            System.out.println(); // 개행
        }
    }
}