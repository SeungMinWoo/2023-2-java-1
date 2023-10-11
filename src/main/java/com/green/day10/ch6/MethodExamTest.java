package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me =new MethodExam();
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(0);

        int r =me.randomValFromTo(10,100);
        int r2 = me.randomValFromTo(5,9);
        System.out.println(r);
        System.out.println(r2);

        for (int i = 0; i <1000 ; i++) {
            int s =me.randomValFromTo(10,100);
            if (s<10||s>100){
                System.out.println("잘못된값!!!");
                break;
            }
        }

        me.scoreResultprint(101);
        me.scoreResultprint(100);
        me.scoreResultprint(90);
        me.scoreResultprint(89);
        me.scoreResultprint(79);
        me.scoreResultprint(69);
        me.scoreResultprint(-1);

    }
}
