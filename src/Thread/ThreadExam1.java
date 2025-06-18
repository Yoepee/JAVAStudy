package Thread;

public class ThreadExam1 {
    public static void main(String[] args) {
        MyThread1 mth1 = new MyThread1("*");
        MyThread1 mth2 = new MyThread1("-");

        mth1.start();
        mth2.start();

        System.out.println("끝!!!");
    }
}
