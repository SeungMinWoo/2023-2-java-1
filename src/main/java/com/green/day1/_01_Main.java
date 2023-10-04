package com.green.day1;
class _01_Main {
    public static void main(String[] argdsss){
        System.out.println("오늘 저녁은 고기다.");
    }
}

    /*
    1. public
     1) public: 모든곳에서 접근이 가능 함
     2) protected: 같은 패키지안의 클래스나 상속 클래스에서만 접근이 가능 함
     3) private: 클래스내에서만 접근 가능
     4) default: 같은 패키지 안에서만 가능
     --> 따라서 main은 모든 프로그램의 메소드 기본으로써 접근해야하므로 public만 가능. 즉 모든 클래스에서 접근 가능한 메소드

    2. static
     1) static: 프로그램이 실행될 때 저장 됨 (Garbage Collector가 정리 못함)
     2) heap: 메소드(연산)이 실행될 때 저장됨. (Garbage Collector가 정리함)
     --> Garbage가 정리하면 안 되므로 static영역에 메모리를 할당한다고 선언 하는 것

     3. void
     --> void의 의미는 return이 없다는 것. 메인이 죽으면 프로그램이 종료되므로 return값을 가지지 않기 위해 선언

     4. main
     --> java의 시작 문법 규칙

     5. String[] args
     --> String: 문자열, []은 배열을 뜻 함. 즉 args라는 이름의 문자배열을 사용하겠다는 뜻
    */
