package com.green.day3.ch4;

public class OperatorEx32 {
    public static void main(String[] args) {
        //조건식? true 였을 때 : false였을 때
        int n1= 10, n2 = 20;

        int r = n1 > n2 ? n1 : n2; // true라면 n1을 쓰고, false면 n2를 쓴다 -> r로 들어간다.
        System.out.println("r: " + r);

    }
}
