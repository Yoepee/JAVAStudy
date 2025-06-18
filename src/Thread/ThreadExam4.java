package Thread;

public class ThreadExam4 {
    public static void main(String[] args) {
        MyThread4 mth1 = new MyThread4();
        mth1.start();

        synchronized (mth1){
            try{
                System.out.println("완료될때까지 대기");
                mth1.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(mth1.total);
        }
    }
}
