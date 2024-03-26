package HappyJava.src;

public class MyException extends RuntimeException{
    //오류 메시지, 발생한 Exception을 감싼 결과로 내가 만든 Exception 활용

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
