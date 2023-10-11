package day7.ch5;

public class Array3Misson2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};
        int[] arr2 = new int[arr1.length+1];
        // 리터럴 가능한 쓰지마라 int[] arr2 = new int[4]; 요런거
        for (int i = 0; i <arr1.length ; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = 20; //끝번호만 찾는거
       // arr2[arr1.length-1] 나의 마지막 방번호 찾는거 = 20;
        for (int i = 0; i < arr2.length ; i++) {
            System.out.printf("arr2[%d] : %d\n",i,arr2[i]);
        }
    }
}
