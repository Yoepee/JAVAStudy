import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("Hello");
        boolean flag2 = set1.add("world");
        boolean flag3 = set1.add("Hello");

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(set1.size());

        // Set에서 바로 문자 출력
        for(String str : set1){
            System.out.println(str);
        }

        // Set의 Iterator를 활용해서 출력
        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}