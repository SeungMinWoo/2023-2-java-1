package com.green.day10.ch5;

import java.util.Scanner;

public class MultArrEx4_1 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"intager", "점수"}
        };
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            String[]wordArr=words[i];
            System.out.printf("Q%d,%s의 뜻은? >>",i+1,wordArr[0]);
            String answer = sc.nextLine();
            String expextedAnswer = wordArr[1];

            if (!answer.equals(expextedAnswer)) {
                System.out.printf("오답입니다,정답은%s입니다\n",expextedAnswer);
                continue;
            }

                System.out.println("정답입니다");
            }
        System.out.println("끝!!");
        }
    }





