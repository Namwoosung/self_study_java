package com.example;

public class CarExam {
    public static void main(String[] args){
        //익명 클래스 생성
        Car c1= new Car(){
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오바링딩");
            }
        };

        c1.a();

    }
}
