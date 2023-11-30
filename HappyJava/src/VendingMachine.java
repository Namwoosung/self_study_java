public class VendingMachine {
    //filed

    //constructor

    //method
    public String pushProductButton(int menuId){
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }

    //static 메소드는 인스턴스를 생성하지 않아도 사용 가능
    // -> VendingMachine.printVersion()으로 사용 가능
    public static void printVersion(){
        System.out.println("v1.0");
    }
}
