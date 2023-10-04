package com.green.day3.ch4;

public class AssignmentOperators {
    public static void main(String[] args) {
        //복합 대입 연산자
        int n1, n2, n3;
        n3 = 10;
        n1 = n2 = n3; // 1) n3를 읽어와서 복사 후 n2에 쓰기 2) n2복사하여 n1에 쓰기. (오른쪽에서 넘겨줌)
        System.out.printf("n1: %d, n2:%d, n3: %d\n"
                , n1, n2, n3);

        n1 = n1 + 4; //n1값을 읽어 온 후(읽기부터) 연산 후 n1값 업데이트
        System.out.printf("n1: %d, n2:%d, n3: %d\n"
                , n1, n2, n3);

        n2 += 4;
        System.out.printf("n1: %d, n2:%d, n3: %d\n"
                , n1, n2, n3);

        n3++; // (=증감식) 1씩 올리고 싶을 때
        ++n3;
        System.out.printf("n1: %d, n2:%d, n3: %d\n"
                , n1, n2, n3);

        n2--; // 1씩 내리고 싶을 때
        --n2;
        System.out.printf("n1: %d, n2:%d, n3: %d\n"
                , n1, n2, n3);




    }
}
