package Thread;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("데몬 쓰레드가 실행중입니다.");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThread());
        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(6000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("메인쓰레드가 종료됩니다.");
    }
}
