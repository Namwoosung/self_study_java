package HappyJava.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExam2 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str1);
        System.out.println(str1);

    }
}
