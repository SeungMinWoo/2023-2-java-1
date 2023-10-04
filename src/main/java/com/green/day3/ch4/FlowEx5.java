package com.green.day3.ch4;

import java.util.Locale;
import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        System.out.printf("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt(); //score에 들어갈 점수 입력(input)

        if(score >= 90) { //A

            if (score >= 98) {
                System.out.println("A+");
            } else if(score <= 93) {
                System.out.println("A-");
            } else {
                System.out.println("A");
            }

        } else if(score >= 80) { //B

            if (score >= 88) {
                System.out.println("B+");
            } else if(score <= 83) {
                System.out.println("B-");
            } else {
                System.out.println("B");
            }

        } else { //C
            System.out.println("C");
            }
        }
    }