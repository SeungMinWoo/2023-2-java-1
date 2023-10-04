package com.green.day5.ch4;

public class MultiFor2 {
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
        System.out.println("-------");
        for (int i = 0; i < 5; i++) {
            for (int z = 0; z < 5; z++) {
                System.out.printf("*");
            }
            System.out.println(); //for 1회 실행 후 개행하므로 ln추가
        }

    }
}
