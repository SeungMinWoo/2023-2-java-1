package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 =  new NumberBox();
        //넘버박사의 객채 주소만 담을수있다
        System.out.printf("%d+%d=%d\n",10,20,(10+20));
        System.out.printf("%d+%d=%d\n",30,40,(30+40));

        System.out.println("-------------------");
        nb1.sum(10,20);
        nb1.sum(30,40);
        nb1.minus(40,20);
        nb1.minus(40,10);
        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(-33);
        nb1.abs(39);
    }
}
