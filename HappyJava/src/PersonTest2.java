package HappyJava.src;

public class PersonTest2 {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p2.name = "조조";

        System.out.println(p1.name);
        System.out.println(p2.name);
        //count는 클래스 필드이기에 인스턴스 접근보다 클래스 자체에서 접근하는 것이 더 적합한 방식이긴 함
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);

        System.out.println(Person.count);
        

    }
}
