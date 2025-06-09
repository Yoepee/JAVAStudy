public class InnerExam {
    class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }

    public static void main(String[] args) {
        calcExam cal = new calcExam();
        calcExam.Cal cal1 = cal.new Cal();
        cal1.plus();
        System.out.println(cal1.value);
    }
}
