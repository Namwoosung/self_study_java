package HappyJava.src;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k2", "hi2");

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
    }
}
