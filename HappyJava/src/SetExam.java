package HappyJava.src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //add는 boolean을 반환
        set.add("hello"); //true 반환
        set.add("hi"); //true 반환
        set.add("hi"); //false를 반환

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
