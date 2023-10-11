package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
    Tv tv1 = new Tv();
   //Tv 객체의 주소값을 들어있는 래퍼런스 변수
   // 대문자 시작하는 애들 주소값 가지고있음 타입지정한애들만 가능
   // NEW 문서에 있는애 객체로 만드는애
   // 객체 생성
        //프라모티브 타입만 디폴트 값 있음
    tv1.channel=10;
    tv1.power=true;
    tv1.color="빨간색";


    Tv tv2 = new Tv();
    tv2.channel=20;

        System.out.println("tv1 == tv2>>"+(tv1==tv2));
        //둘은 주소 값이 다름
        System.out.println("tv1.channel"+tv1.channel);
        System.out.println("tv1.power"+tv1.power);
        System.out.println("tv1.color"+tv1.color);

        System.out.println("-----------------------");
        
        System.out.println("tv2.channel"+tv2.channel);
        System.out.println("tv2.power"+tv2.power);
        System.out.println("tv2.color"+tv2.color);
    }
}
