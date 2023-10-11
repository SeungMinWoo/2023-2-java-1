package com.green.day10.ch5;

import java.util.Scanner;

public class MultArrEx_test1 {
    public static void main(String[] args) {
        String[][] woeds = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"intager", "점수"}
        };
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < woeds.length ; i++) {
            System.out.print(woeds[i][0]+"의뜻은");
            String ss = sc.nextLine();
            if (ss.equals(woeds[i][0])){
                System.out.println("정답입니다");
            }
            else {
                System.out.println("틀렸습니다 : 정답은%s"+woeds[i][1]);
            }
        }

    }
}
