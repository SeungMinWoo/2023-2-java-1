package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은 \n", x);
        if( x == 0 ) {System.out.println("x==0");} //if() 후 중괄호{} 영역이 true일때만 실행
        if( x != 0)  {System.out.println("x!=0");} //if가 false이므로 출력이 skip.

        System.out.println("---");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은 \n", x);
        if( x == 0 ) {System.out.println("x==0");} //이럴땐 이렇고 저럴땐 저런것=분기문 if의괄호는 비교연산자(true / false)
        if( x != 0)  {System.out.println("x!=0");}

        if( !(x == 0) ) {System.out.println("!(x==0)");} // false식에 느낌표를 붙여 ture로 변환 =not
        if( !(x != 0))  {System.out.println("!(x!=0)");}

        System.out.println("끝!");
    }
}
