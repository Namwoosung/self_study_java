public class Book {
    private int price;

    //필드에 값에 접근하는 메서드를 setter, getter를 사용
    public int getPrice() {
        return price; //this.price도 가능
        //this의 의미는 내 자신의 instance
        // -> this는 static method에서는 사용 불가능(static은 인스턴스 생성 이전에 메모리에 생성되기에)
    }

    public void setPrice(int price) { //외부에서 price를 받아 자신의 인스턴스 변수인 price를 초기화
        //price는 지역변수
        //this.price는 인스턴스 변수
        this.price = price;
    }
}



