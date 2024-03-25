package HappyJava.src;

public class CarExam02 {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.printName();
        System.out.println("----------");
        Car c2 = new Car("모하비");
        c2.printName();
    }
}
