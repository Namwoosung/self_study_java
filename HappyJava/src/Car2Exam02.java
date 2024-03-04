public class Car2Exam02 {
    public static void main(String[] args){
        //Car2 c = new Car2(); error

        Bus2 b = new Bus2();
        b.run(); //후륜구동 동작

        SportCar s1 = new SportCar("Sport");
        s1.run(); //사륜구동

        Car2[] array = new Car2[2];
        array[0] = new Bus2();
        array[1] = new SportCar("s");
        for(Car2 c2 : array){
            c2.run();
        }
    }
}
