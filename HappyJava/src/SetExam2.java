package HappyJava.src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 5000));
        mySet.add(new MyData("lee", 2000));
        mySet.add(new MyData("hong", 7000));
        mySet.add(new MyData("hong", 7000));


        Iterator<MyData> iterator = mySet.iterator();
        while(iterator.hasNext()){
            MyData mydata = iterator.next();
            System.out.println(mydata);
        }

    }
}

class MyData{ //MyData는 불변 객체
    private String name;
    private int value;

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }
}