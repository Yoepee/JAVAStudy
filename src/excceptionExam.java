public class excceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 2;
        try {
            int k = i/j;
            System.out.println(k);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다." + e.toString());
        } finally {
            System.out.println("계산 종료");
        }
    }


}
