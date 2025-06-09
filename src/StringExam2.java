public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello World";
        String str2 = str1.substring(5);

        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        String str5 = "";
        for(int i = 0; i < 10; i++){
            str5 += "*";
        }
        System.out.println(str5);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++){
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
        // 문자열을 반복문에서 동작시키는건 속도가 느림
    }
}
