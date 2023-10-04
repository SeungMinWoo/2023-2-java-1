package com.green.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        final int MIN = 15, MAX = 18; //

        //리터럴은 더이상 하지않음
        //min, maxn 변수만 사용하여
        //MIN ~ MAX 나올 수 있는 랜덤 숫자를 만드는 로직 구현

        for(int i=0; i<1000; i++) {
            int val = (int)(Math.random() * (MAX-MIN) +1 ) + MIN;
            System.out.println("val: " + val);
            if(val < MIN || val > MAX) {
                System.out.printf("범위를 벗어났습니다.");
                break; //switch에 쓰거나 반복문에서 사용
            }
        }
        System.out.printf("끝");

    }
}