package com.green.day2.ch2;

public class _02_Printf {
    public static void main(String[] args) {
        System.out.println("안녕"); // 'println'은 자동줄바꿈
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("----------------");
        System.out.printf("Hello"); //'printf'는 자동줄바꿈 X
        System.out.printf("Hello");
        System.out.printf("Hello");
        System.out.println("-------------");
        System.out.printf("Halo\n"); //'printf'에서 줄바꿈을 할 경우 '\n(=이스케이프 문자)표기'
        System.out.printf("Halo\n");
        System.out.printf("Halo\n");

        String name = "병아리";
        int age = 23;
        char bloodType = 'B'; // char은 한 단어 인 경우
        float height = 178.8f;

        //제 이름은 홍길동이고, 나이는 23세 이고, 혈액형은 B형이고, 키는 178.8cm입니다.
        System.out.printf("제 이름은" + name + "이고, " + "나이는" + age + "세 이고, " + "혈액형은" + bloodType + "형이고, " + "키는" + height + "cm입니다");
        System.out.println("-------");
        System.out.printf("제 이름은 %s이고, 나이는%d세이고, 혈액형은 %c형이고, 키는 %.2fcm입니다." //첫번째는 문자열, 값을 주입할 %를 입력
        , name, age, bloodType, height);

        /*
        1. %d: 정수 (ex: %3d로 스페이스 등 강제 공간 부여 가능)
        2. %f: 실수 (ex: %.2fcm 등 강제 소수점 부여 가능)
        3. %c: 문자
        4. %s: 문자열
         */
    }
}
