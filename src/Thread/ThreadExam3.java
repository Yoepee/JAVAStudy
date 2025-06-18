package Thread;

public class ThreadExam3 {
    public static void main(String[] args) {
        MyThread3 mth1 = new MyThread3();

        mth1.start();

        System.out.println("시작");

        try {
            mth1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("종료!");
    }
}
