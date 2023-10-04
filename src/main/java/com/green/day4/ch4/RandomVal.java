package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleval = Math.random(); //최소 0.00000~ 최대 ~0.99999, 1은 나오지않음
        System.out.println("val:" + doubleval);

        int intVal = (int)(doubleval * 10);
        System.out.println("intVal:" + intVal);

        int rVal = (int)(Math.random()*20);
        System.out.println("rVal:" + rVal);
    }
}