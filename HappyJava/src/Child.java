package HappyJava.src;

public class Child extends Parent{
    public int i = 15; //field overridng
    public void printI(){ //method overriding
        System.out.println("child - printI(): " + i);

    }
}
