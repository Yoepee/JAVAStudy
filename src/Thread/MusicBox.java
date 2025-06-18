package Thread;

public class MusicBox {
    private String MusicA = "신나는 음악";
    private String MusicB = "슬픈 음악";
    private String MusicC = "카페 음악";
    
    public synchronized void playMusicA(){
        for (int i = 0; i< 10; i++){
            System.out.println(MusicA);

            try{
                Thread.sleep((int)(Math.random() *1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB(){
        for (int i = 0; i< 10; i++){
            System.out.println(MusicB);

            try{
                Thread.sleep((int)(Math.random() *1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicC(){
        for (int i = 0; i< 10; i++){
            synchronized (this){
                System.out.println(MusicC);
            }

            try{
                Thread.sleep((int)(Math.random() *1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
