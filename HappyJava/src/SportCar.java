package HappyJava.src;

public class SportCar extends Car2{

    public SportCar(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println("사륜구동");
    }
}
