public class ExceptionExam2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int k = divide(a, b);
            System.out.println(k);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다.");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    public static int divide(int a, int b) throws ArithmeticException, IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("분모가 0일 수 없습니다.");
        }

        int k = a/b;
        return k;
    }
}
