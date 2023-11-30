public class MyMath {
    //기본생성자는 생성자가 없을 경우 컴파일할 때 자동으로 생성됨
    //public MyMath(){} <- 기본 생성자
    private MyMath(){} //이렇게 선언하면 생성자가 존재하니 기본생성자가 생성되지 않음 -> 생성자가 private이므로 이 class는 인스턴스 생성 불가
    // -> 해당 class는 static한 method만 사용가능해 질 것
    //Math 라이브러리는 모든 field와 method가 static이므로 인스턴스를 생성할 필요가 없고, 오히려 heap공간 낭비이므로 생성자를 private으로 만들어 인스턴스 생성을 불가능하게 만듦

    public static int abs(int x){
        if(x < 0){
            return x * -1;
        }else
            return x;
    }
}
