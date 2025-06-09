public class calcExam {
    class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args){
        Calculator cal = new MyCal();

        System.out.println(cal.exec(2, 1));

        System.out.println(Calculator.exec2(2, 1));
    }
}
