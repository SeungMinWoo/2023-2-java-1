package com.green.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args) {
       int r1 = 0, n1 = 0, a1 = 0;
       r1 = ++n1; //쓰기+읽기 (=이있으면 오른쪽부터 n1의쓰기부터
       ++a1;
        System.out.printf("r1: %d, n1:%d, a1:%d\n", r1, n1, a1);


        int r2 = 0, n2 = 0, a2=0;
        r2 = n2++; //읽기먼저 ( 동시 상황++이 뒤에있는경우 읽기먼저, 복사 후 1올림)
        a2++;
        System.out.printf("r2: %d n2:%d, a2:%d\n", r2, n2,a2);


    }
}
