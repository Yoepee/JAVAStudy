import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "park");
        map.put("004", "kim");
        map.put("002", "kang");

        System.out.println(map.size());

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
