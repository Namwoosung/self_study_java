package com.example;

//싱글톤패턴
public class BeanFactory {
    private static BeanFactory instance = new BeanFactory();

    private BeanFactory(){
    }

    public static BeanFactory getInstance(){
        return instance;
    }

    //객체생성을 대신 해줌 -> 팩토리 역할
    public Bus getBus(){
        return new Bus();
    }
}
