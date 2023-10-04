package com.green.day2.ch3;

public class OperatorEx21 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 10, n3 = 11, n4 = 9;
        System.out.printf("%d < %d : %b\n", n1 , n2 , n1 < n2); // %b는 boolean
        System.out.printf("%d < %d : %b\n", n1 , n3 , n1 < n3);
        System.out.printf("%d <= %d : %b\n", n1 , n2 , n1 <= n2);
        System.out.printf("%d > %d : %b\n", n1 , n2 , n1 > n2);
        System.out.printf("%d >= %d : %b\n", n1 , n2 , n1 >= n2);
        System.out.printf("%d >= %d : %b\n", n1 , n4 , n1 >= n4);
        System.out.printf("%d == %d : %b\n", n1 , n4 , n1 == n4); // 같은가
        System.out.printf("%d != %d : %b\n", n1 , n2 , n1 != n2); // !는 같은가의 반대(not)
        System.out.printf("%d != %d : %b\n", n1 , n3 , n1 != n3);
        System.out.printf("%d != %d : %b\n", n1 , n4 , n1 != n4);
    }
}
