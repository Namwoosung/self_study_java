package HappyJava.src;

import HappyJava.src.Car2;

public class Bus2 extends Car2 {
    public Bus2(){
        super("Bus");
        System.out.println("Bus2 생성자");
    }

    @Override
    public void run() {
        System.out.println("후륜구동 동작");
    }
}
