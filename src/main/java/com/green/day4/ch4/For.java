package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        //첫번째: 초기화 공간
        //두번째: 반복여부 체크
        //세번째: 증감식
        for( int i=0;  i<5; i++) { //i=0이 0번, i<5가 1번, 안녕이 2번, i++3번. true일때 실행되므로 2가 트루. 1,2,3계속반복 (1이 false가될때까지)0은 최초실행
            System.out.printf("안녕");
            System.out.printf("-끝-");

            int j=0;
            for( ; j <10 ; ){
                System.out.println("j" + j++); // 0부터 count
                System.out.println("j" + (++j)); //1부터 count

            }
        }

    }
}
