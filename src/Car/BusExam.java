package Car;

public class BusExam {
    public static void main(String[] args) {
        Car c = new Bus();
        c.run();

        Bus b = (Bus)c;
        b.horn();
    }
}
