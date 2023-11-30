public class MathBeanTest {
    public static void main(String[] args){
        MathBean math = new MathBean();

        math.printClassName();
        math.printNumber(math.getOne());
        int result = math.plus(1, 2);
        System.out.println(result);
    }
}
