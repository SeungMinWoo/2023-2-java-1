package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int a = scan.nextInt();

        for(int i=a; i>0; i--) {
            for(int z=1; z<=a; z++) {
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
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
