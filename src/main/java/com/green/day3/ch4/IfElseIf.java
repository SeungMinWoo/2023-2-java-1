package com.green.day3.ch4;

public class IfElseIf {
    public static void main(String[] args) { //위에서부터 읽어서 true를 첫번째 읽어냄. 하나만실행됨. 세개다true일경우 1만 출력
        if(1 == 1) {
            System.out.println("1");
        } else if(2 == 2) {
            System.out.println("2");
        } else if(3 == 3) {
            System.out.println("3");
        } else {
            System.out.println("else");
        }
        }
    }