package com.example;

//Ball은 불변객체로 선언
public class Ball {
    private int number;
    public Ball(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
