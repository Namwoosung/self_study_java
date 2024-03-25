package HappyJava.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.sort(list);
        for(String i: list){
            System.out.println(i);
        }

        Collections.shuffle(list);
        for(String i: list){
            System.out.println(i);
        }
    }
}
