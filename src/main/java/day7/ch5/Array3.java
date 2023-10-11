package day7.ch5;

public class Array3 {
    public static void main(String[] args) {
        int[]arr1={5,10,15,};
        int[]arr2=new int[arr1.length];//딥카피

        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i]; //딥카피
        }
        // 동동성 (equals)비교 : 같은값 : 동일성 주소 값이 같은지 묻는거(==) 셸로카피 둘다같음
        //딥카피 동일성 다름 주소가달라서 동동성은 같음
        arr2[1]=200;
        System.out.println("----------arr1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]:%d\n",i,arr1[i]);
        }
        System.out.println("-----arr2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]:%d\n",i,arr2[i]);
        }
    }
}
