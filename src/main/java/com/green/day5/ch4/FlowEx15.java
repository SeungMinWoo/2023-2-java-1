package com.green.day5.ch4;

public class FlowEx15 {
    public static void main(String[] args) {
        final int DAN = 6;
        for (int i = 1; i <=9; i++) {
            int aa = DAN*i;
            System.out.printf("%d X %d = %d\n", DAN, i, aa);
        }

        /*
        6 * 1 = 6
        6 * 2 = 12
        6 * 3 = 18
        ...
        6 * 9 = 54
         */
    }
}
