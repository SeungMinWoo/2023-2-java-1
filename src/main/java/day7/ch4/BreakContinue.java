package day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
    // break 를 사용할 수 있는곳: switch 반복분

        // continue를 사용 할수 있는곳; 반복문
        for (int i=0 ;i<10; i++){
            System.out.println(i);
            if(i==5) {break;}
        }
        System.out.println("---------------");
        for (int i=0 ;i<10; i++){
            System.out.println(i);
            if (i%2==0){continue;}
            System.out.println(i*i);
    }
}
    }
