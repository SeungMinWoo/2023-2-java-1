package com.green.day2.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        boolean b1 = 1 == 1 && 2 == 2; // and연산자 && (true and ture이므로 b1는 ture)
        System.out.println("b1 : " + b1);

        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4; // and연산자 && (ture and true and false 인 경우 false.여러개 중 하나라도)
        System.out.println("b2 : " + b2);

        System.out.println("--------------------");

        boolean b3 = 1 == 2 || 2 == 3 || 4 == 4; // or연산자 || (혹시나 이 중 하나라도 ture가 있으면 only ture)
        System.out.println("b3 : " + b3);

        boolean b4 = 1 == 2 || 2 == 3 || 4 == 5; // or연산자 || (다 다르므로 flase)
        System.out.println("b4 : " + b4);

        System.out.println("-------------");

        //부정연산자
        boolean b5 = 1 == 1;
        System.out.println("b5 : " + b5);
        System.out.println("!b5 : " + !b5); // 느낌표가 추가될 경우 반대값(=not)이 나옴
        System.out.println("!!b5 : " + !!b5);
/*
종합
1. and는 하나라도 false가 있는 경우 false 때문에 이 확률이있는 연산을 앞에 적는것이 효율적
2. or은 하나라도 true가 있는 경우 ture. 때문에 이 확률이있는 연산을 앞에 적는것이 효율적
3. 느낌표의 경우 반대값(not) 출력
 */
    }
}
