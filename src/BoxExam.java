public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();
        System.out.println(obj);

        box.setObj("hellow");
        String str = (String)box.getObj();
        System.out.println(str);

        box.setObj(10);
        int num = (int)box.getObj();
        System.out.println(num);

        Box<String> box2 = new Box<>();
        box2.setObj("hello");
        String str2 = box2.getObj();
        System.out.println(str2);

        Box<Integer> box3 = new Box<>();
        box3.setObj(10);
        int num2 = box3.getObj();
        System.out.println(num2);
    }
}
