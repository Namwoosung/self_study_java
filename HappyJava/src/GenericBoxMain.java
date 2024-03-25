package HappyJava.src;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> genericBox2 = new GenericBox<>();
        genericBox2.set(5);
        Integer intValue = genericBox2.get();
        System.out.println(intValue);
    }
}
