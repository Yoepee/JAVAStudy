package Thread;

public class ThreadExam2 {
    public static void main(String[] args) {
        MyThread2 mth1 = new MyThread2("**");
        MyThread2 mth2 = new MyThread2("--");

        Thread t1 = new Thread(mth1);
        Thread t2 = new Thread(mth2);

        t1.start();
        t2.start();

        System.out.println("끝 !!!");
    }
}
