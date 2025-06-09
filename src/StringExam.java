public class StringExam {
    public static void main(String[] args) {
        String str = new String("Hello World");
        String str2 = "Hello World";

        int leng = str.length();
        String str3 = str.concat(str2);

        System.out.println(leng);
        System.out.println(str3);
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(3, 7));
    }
}
