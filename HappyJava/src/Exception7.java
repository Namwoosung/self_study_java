package HappyJava.src;

public class Exception7 {
    public static void main(String[] args) {
        try{
            ExceptionObj7 exobj = new ExceptionObj7();
            int value = exobj.divide(10 ,0);
            System.out.println(value);
        } catch(MyException ex){
            System.out.println("사용자 정의 Exception 발생");
        }
    }
}

class ExceptionObj7{
    public int divide(int i, int k) throws MyException{
        int value = 0;
        try{
            value = i / k;
        }catch(ArithmeticException ae){
            throw new MyException("0으로 나눌 수 없습니다.");
        }

        return value;
    }
}