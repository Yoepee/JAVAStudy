import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(" ");
        list.add("World");
        list.add("Hello");

        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
