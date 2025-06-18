package Thread;

public class MyThread4 extends Thread {
    int total = 0;

    @Override
    public void run() {
        synchronized (this){
            for(int i = 0; i<5; i++){
                    System.out.println(i + "를 더합니다.");
                    total += i;

                try{
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
}
