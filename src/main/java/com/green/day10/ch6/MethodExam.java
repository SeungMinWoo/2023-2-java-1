package com.green.day10.ch6;

public class MethodExam {



    void checkZero(int n){
        System.out.printf("0%s\n",n==0?"입니다" : "아닙니다");
        if(n==0){
            System.out.println("0입니다");
            return;
        }
        System.out.println("0이 아닙니다");
    }
    int randomValFromTo(int n,int n1){
        return  (int)(Math.random()*(n1-n+1))+n;

    }
    void scoreResultprint(int n){
        if (n>100||n<0) {
            System.out.println("잘못된점수");
            return;

        }
        String grade ="D";
         if (n>=90) {
             grade ="A";
        } else if (n>=80) {
             grade ="B";
        } else if (n>=70) {
             grade ="C";
        }
            System.out.printf("%s학점\n",grade);



                        }
                    }





