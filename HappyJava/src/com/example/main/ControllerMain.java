package HappyJava.src.com.example.main;

import HappyJava.src.com.example.fw.Controller;
import HappyJava.src.com.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args){
        Controller c1 = new FirstController();
        c1.execute();
    }
}
