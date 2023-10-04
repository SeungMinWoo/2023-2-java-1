package com.green.day1;

public class _03_VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tp = x;
        x = y;
        y = tp;

        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
