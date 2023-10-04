package com.green.day2.ch2;

public class Misson1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3; //리터럴 사용 불가

        double r= (double)n1 / n2; //예시1
        float r1= (float) n1 / n2; //예시2

        System.out.println("r : " + r);
        System.out.println("r1 : " + r1);


        System.out.println((double) n1 / n2); //예시3

    }
}
