package HappyJava.src;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p2.name = "조조";

        System.out.println(p1.name);
        System.out.println(p1.name.length()); //3
        System.out.println(p1.address); //null
        System.out.println(p1.address.length()); //error <- null 참조 error
        System.out.println(p1.isVip); //false

        System.out.println(p2.name);
        System.out.println(p2.address); //null
        System.out.println(p2.isVip); //false


    }
}
