package HappyJava.src;


public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        switch(day){
            case SUNDAY:
                System.out.println("일요일");
                break;
            case MONDAY:
                System.out.println("월요일");
                break;
            default:
                System.out.println("이외의 요일");
        }
    }
}
