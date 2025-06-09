package Car;

// 클래스
public class Car {
    // 타입 필드명
    private String name;
    private int num;

    public Car(){
        this("이름없음", 0);
        System.out.println("Car의 기본생성자");
    }

    public Car(String name){
        this(name, 0);
    }

    public Car(String name, int num){
        this.name = name;
        this.num = num;
    }

    // 메소드
    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public  int getNum() {
        return this.num;
    }

    public  String getName() {
        return this.name;
    }

    public void run(){
        System.out.println("달리다");
    }
}
