package com.green.day4.ch4;

public class RandomValMission {
    public static void main(String[] args) {
        double doubleval = Math.random();
        int rVal = (int)(Math.random() * 6) + 5; // 5~10
        System.out.println("rVal : "+rVal);

        int rVal2 = (int)(doubleval * 10) +14 ; // 14~23 (1. 0+14  2. 9차이  3. 9+1을 더하여 10이 생성)
        System.out.println("rVal : "+rVal2);
    }
}