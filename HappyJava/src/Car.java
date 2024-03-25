package HappyJava.src;

public class Car {

    //public Car(){} <- 기본생성자

    private String name;

    public Car(){
        System.out.println("자동차가 한 대 생성됩니다.");
    }

    public Car(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("자동차 이름:" + name);
    }

    public void run(){
        System.out.println("달리다.");
    }

    @Override
    public String toString() {
        return "자동차!";
    }
}
