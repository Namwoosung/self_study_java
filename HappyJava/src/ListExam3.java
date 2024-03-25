package HappyJava.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam3 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");

        System.out.println(collection.size());

        //collection.get(0); <- error
        //collection은 ArrayList를 참조하지만, Collection type의 객체 => Collection이 가진 method만 사용 가능

        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
