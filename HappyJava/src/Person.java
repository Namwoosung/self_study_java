package HappyJava.src;

import org.w3c.dom.ls.LSOutput;

public class Person {
    String name;
    String address;
    boolean isVip;

    static int count; //클래스 필드
    static { //static field는 선언시 초기화 가능 and static block 내에서 초기화 가능
        count = 100;
    }

    

    public void printName(){
        System.out.println("내 이름은" + name);
    }

    public static void printCount(){
        System.out.println("count: " + count);
    }
}
