package Car;

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

//        car.name = "소방차";
//        car.num = 1234;
//
//        car2.name = "경찰차";
//        car2.num = 1111;
//
//        System.out.println(car.name);
//        System.out.println(car.num);
        car.setName("소방차");
        car.setNum(1234);
//        car.horn();

        String CarName = car.getName();
        int CarNum = car.getNum();
        System.out.println(CarName);
        System.out.println(CarNum);

        Bus bus = new Bus();
        String busName = bus.getName();
        bus.run();
        bus.horn();
        System.out.println(busName);
    }
}
