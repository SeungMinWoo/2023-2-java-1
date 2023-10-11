package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] name = {"kim","park","Yi"};

        String s1="ddd";
        for (int i = 0; i < name.length; i++) {
            System.out.printf("name[%d]:%s\n",i,name[i]);
        }
        name[1]="Woo";
        System.out.println(Arrays.toString(name));

        //int j=0; 인덱스 사용할떄
        for (String str:name){ //foreach  //타입,변수,배열
            System.out.println(str);
            //System.out.printf("name[%d]:%s\n",j++,str);
        }
        System.out.println("------");
        for (int i=0; i<name.length;i++){
            String str = name[i];
            System.out.println(str);
        }
    }
}
