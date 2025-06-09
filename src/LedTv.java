public class LedTv implements TV{

    @Override
    public void turnOn() {
        System.out.println("LED TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LED TV OFF");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("LED TV Volume : " + volume);
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("LED TV Channel : " + channel);
    }
}
