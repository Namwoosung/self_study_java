//VendingMachine class를 사용하는 main
public class VendingMachineMain {
    //static이 붙은 method는 class method라고 지칭
    //class method는 instance를 만들지 않아도 사용 가능
    // -> 즉 인스턴스를 생성하지 않아도 메모리에 올라가있음
    public static void main(String[] args){
        //main method내에서 VedingMachine이라는 class를 사용하고 있음
        // -> VendingMachineMain은 VendingMachine에 의존한다(VendingMachine이 없으면 컴파일 에러 발생)
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        //static method는 아래 2가지 방법 모두 사용 가능하긴 함
        // class에서 바로 호출과 레퍼런스 변수로 접근해서 호출
        //but 인스턴스에서 호출하는 것은 바람직한 방법이 아님
        // -> 그냥 class이름.printVersion()으로 호출하는 것이 적합함
        VendingMachine.printVersion();
        //vm2.printVersion();
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}