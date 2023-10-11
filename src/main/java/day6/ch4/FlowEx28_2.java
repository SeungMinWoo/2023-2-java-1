package day6.ch4;

import java.util.Scanner;

public class FlowEx28_2 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println("ansert : " + answer);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1~100사이의 숫자 입력");
            input = scan.nextInt();
            if (input == answer) {break;}
            System.out.println(input < answer ? "up" : "down");

        }
        System.out.println("정답");

    }
}