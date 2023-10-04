package com.green.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        //반복문을 사용하여 1~10을 전부 더한 값을 출력
        // 55출력

        int sum = 0; // sum이 밖에 있어야됨
        for (int i = 1; i <= 10; i++) {
            sum +=i;  //for안에 있는애들은 하루살이임
        } //int sum이  for안에 있을 경우 새로운 int sum이 반복하게됨
        System.out.println("sum: " + sum);
    }
}