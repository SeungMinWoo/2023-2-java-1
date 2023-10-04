package day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println("ansert : " + answer);

            Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1~100사이의 숫자 입력");
            int i = scan.nextInt();

            if (answer < i){
                System.out.println("down");
            } else if (answer>i){
                System.out.println("up");

            }
            else {
                System.out.println("정답");
                break;
            }
        }
        }
    }
