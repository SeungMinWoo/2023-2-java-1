package com.green.day10.ch6;

public class Tv {
    //맴버필드, 속성, property
    String color;
    boolean power;
    int channel;
    //맴버메소드,메소드
    //리턴타입 void 메소드명 power파라미터 ()
    //메소드 선언부 void  power()구현부{power=!power;}
    void  power(){power=!power;}
    void  channelUp(){channel++;}
    void  channelDown(){channel--;}
}
