package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {

        int val = (int)(Math.random() * 151 ) + 50; // 50~200

        if (val <= 100) {
            System.out.printf("%d는 %d입니다", val, val * 2);
        }else if (val > 100) {
            System.out.printf("%d는 %d입니다", val, val+10);
        }
    }

        //50~200 사이에 랜덤값

        //100이하면 그 값의 *2한 결과값
        //100초과면 그 값의 + 10한 결과값

}
