package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int a = scan.nextInt();

        for (int i=1; i <= a; i++) {
            for (int j=a-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

        /*
         5 입력한 경우

        _____*
        ___**
        __***
        _****
        *****

         */
