package day7.ch4;

import java.util.Scanner;

public class FlowEx32_1 {
    public static void main(String[] args) {
        int menu=0;
        int num = 0;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("(1)square");
            System.out.println("(2)tri");
            System.out.println("(3)log");
            System.out.println("원하는 메뉴(1~3)을 선택하세요. (종료:0)>>");
          int tmep=scanner.nextInt();
        if (tmep==0){break;}
            else if(tmep<1 || tmep>3) {
            System.out.println("메뉴 잘못 선택함");
            //temp==1||temp==2||temp==3||
            continue;
            }
                System.out.printf("선택하신 메뉴는 %d입니다\n",tmep);
        }
        System.out.println("프로그램 종료");
        }
    }

