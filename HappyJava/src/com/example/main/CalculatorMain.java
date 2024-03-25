package HappyJava.src.com.example.main;

//package의 다른 class를 import
import HappyJava.src.com.example.util.Calculator;
//util2의 Calculator는 이름은 동일하지만 다른 class이므로 여기서는 devide기능은 수행 불가

public class CalculatorMain {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int value = cal.plus(50, 100);
        System.out.println(value);
    }
}
