package day6.ch4;

public class FlowEx24 {
    public static void main(String[] args) {
        int i= 11;
        System.out.println("카운터 다운을 시작합니다");
        while (i-- !=0){
            System.out.println(i);

            for (int j=0; j<3_000_000_00; j++){
                System.out.println("");
            }
        }
        System.out.println("Launch");
    }
}
