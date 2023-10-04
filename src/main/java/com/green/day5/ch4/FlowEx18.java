package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) { // hour
            for (int j = 1; j <= 9; j++) { // min
                System.out.printf("%d X %d = %d\n", i, j, i * j);



                //중첩 for문을 활용하여 구구단 2단~9단까지 출력
                //

        /*
        2 x 1 = 2
        2 x 2 = 4
        ...

        3 x 1 = 3
        3 x 2 = 6
        ...

        9 x 9 = 81


         */
            }
        }
    }
}
