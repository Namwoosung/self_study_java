package HappyJava.src.com.example.fw;

public abstract class Controller {
    //protected는 같은 package내에 존재하거나 상속받은 class에서만 접근 가능
    //final keyword를 사용한 method는 overriding 금지
    protected final void init(){
        System.out.println("초기화 하는 코드들...");
    }

    protected final void close(){
        System.out.println("마무리 하는 코드들...");
    }
    protected abstract void run(); //매번 다른 코드

    //내가 가진 메소드를 동작 순서에 따라 호출 <- 템플릿 메소드라고 함
    public void execute(){
        this.init();
        this.run();
        this.close();
    }

}
