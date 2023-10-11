package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][]score={
                {101,102,103}
                ,{21,22,23}
                ,{31,32,33}
                ,{41,42,43}
                ,{51,52,53}
        };
        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("------------------------------");
        int sum =0;
        int dd=0, ss=0 ,aa=0;
        float avg =0f;
        for (int i = 0; i < score.length ; i++) {
            sum=0;
            System.out.print(i+1+"   ");
            dd += score[i][0];
            ss += score[i][1];
            aa += score[i][2];
            for (int j = 0; j <score[i].length ; j++) {
                System.out.printf("  %3d", score[i][j]);
                sum += score[i][j];

            }

            System.out.printf("   %d  ",sum);
             avg=(float)sum/3f;
            System.out.print(avg);
            System.out.println();
        }
        System.out.println("-----------------------------------");
        System.out.printf("       %d   %d  %d ",dd,ss,aa);
    }
}
