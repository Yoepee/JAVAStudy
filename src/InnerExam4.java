public class InnerExam4 {
    public static void main(String[] args) {
        // 추상클래스 사용법
        Action action0 = new MyAction();
        action0.exec();

        // 익명클래스 사용법
        Action action = new Action() {
            @Override
            public void exec() {
                System.out.println("익명클래스");
            }
        };

        action.exec();
    }
}
