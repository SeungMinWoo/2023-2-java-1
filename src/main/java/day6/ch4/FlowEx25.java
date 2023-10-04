package day6.ch4;

import java.util.Scanner;

public class FlowEx25 { public static void main(String[] args) {
        int num =0, sum=0;
        System.out.println("숫자를 입력하세여");
        Scanner scan = new Scanner(System.in); // 1. scanner 객체 생성
         num = scan.nextInt();
       while (num !=0){
           int modval = num%10;
           num=num/10;
           sum += modval;
       }
        System.out.println("결과 " + sum + "입니다.");

    }

}
