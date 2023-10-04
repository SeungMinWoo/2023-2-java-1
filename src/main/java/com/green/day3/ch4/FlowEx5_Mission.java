package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_Mission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("성별을 입력해주세요.");
        String gender = scan.nextLine();
        System.out.println("키를 입력해 주세요.");
        int height = scan.nextInt();

        if ("남자".equals(gender)) { //남자 170

            if (height > 170) {
                System.out.printf("%dcm는 남자 평균 초과입니다.", height);
            } else if (height < 170) {
                System.out.printf("%dcm는 남자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 남자 평균 입니다.", height);
            }


        } else { //여자 157

            if (height > 157) {
                System.out.printf("%dcm는 여자 평균 초과입니다.", height);
            } else if (height < 170) {
                System.out.printf("%dcm는 여자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 여자 평균 입니다.", height);
            }
        }
    }
}

        //남자 평균키 170, 여자 평균키 157
        // scanner을 이용하여 성별 입력받습니다. (남자, 여자)
        // 키를 입력 받습니다.
        // 평균키 미만이면 "156cm는 남자 평균 미만입니다."
        // 평균키랑 같다면 "170cm는 남자 평균 입니다."
        //  평균키 초과면 "170cm는 남자 평균 초과입니다."

        // 평균키 미만이면 "146cm는 여자 평균 미만입니다."
        // 평균키랑 같다면 "170cm는 여자 평균 입니다."
        //  평균키 초과면 "170cm는 여자 평균 초과입니다."