public class TVExam {
    public static void main(String[] args){
        TV tv = new LedTv();
        tv.turnOn();
        tv.turnOff();
        tv.changeVolume(50);
        tv.changeChannel(10);
    }
}
