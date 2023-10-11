package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[]name=new String[3];
        Scanner scan= new Scanner(System.in);

        for (int i = 0; i < name.length ; i++) {
            String ss = scan.nextLine();
            name[i]=ss;
        }
        for (String ss : name) { //foreach  //타입,변수,배열
            System.out.println(ss);
        }
    }
}
