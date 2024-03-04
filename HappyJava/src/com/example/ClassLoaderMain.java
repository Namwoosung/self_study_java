package com.example;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{
        //className에 해당하는 클래스 정보를 CLASSPATH에서 읽고
        // 그 정보를 clazz가 참조하도록 함
        String className = "com.example.SuperCar";
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();
        //위의 세줄의 결과는 Object o = new Bus()와 같음

        clazz.getDeclaredMethod("a", null);

    }
}
