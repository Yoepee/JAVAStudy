package Thread;

public class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i< 5; i++){
            System.out.println("MyThread3 : " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
