import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
//        System.out.println("Hello World");
//        int count;
//        count = 10;
//        count = 20;
//        System.out.println("count = " + count);
//
////        count = 11.1;
//        double avg = 11.1;
//        String name = "carami";
//
//        int totalCount;
//
//        final int J;
//        J = 10;
////        J =20;
//
//        double circleArea;
//        final double PIE = 3.14159;
//        circleArea = PIE * J * J;
//        System.out.println("circleArea = " + circleArea);
//
//        final int OIL_PRICE = 1450;
//        int liter;
//        int totalPrice = OIL_PRICE;
//        System.out.println("totalPrice = " + totalPrice);
        boolean isFun = true;
        System.out.println("isFun = " + isFun);

        char c = 'f';

        int x = 59;

        long big = 345455433L;

        float f = 32.4f;
        double d = 3.24;

//        int value;
//        Scanner sc = new Scanner(System.in);
//        do {
//            value = sc.nextInt();
//            System.out.println("value = " + value);
//        }while(value != 10);
//
//        System.out.println("반복문 종료");

        int[] arr1 = new int[100];
        int[] arr2 = new int[]{1,2,3,4};
        int[] arr3 = {1,2,3,4};
        System.out.println(arr1.length);
         int[][] arr6 = {{1}, {2,1}};
        for (int[] i : arr6) {
            for (int j : i) {
                System.out.println(j);
            }
        }


        // String은 가장 많이 사용하는 클래스임.
        // String은 new 를 사용하지 않아도 값을 생성할 수 있음.

        // 하단 2개의 String은 별도의 인스턴스를 참조함. - new String이 신규 생성
        String str = new String("Hello World");
        String str1 = new String("Hello World");

        // 하단 2개의 String은 같은 인스턴스를 참조하고 있음.
        String str2 = "Hello World";
        String str3 = "Hello World";

        System.out.println(str == str1);
        System.out.println(str2 == str3);
        System.out.println(str3.substring(3));
    }
}