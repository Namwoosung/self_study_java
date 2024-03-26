package HappyJava.src;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class);
        emap.put(Day.SUNDAY, "일요일");

        System.out.println(emap.get(Day.SUNDAY));
    }
}
