package HappyJava.src;

public class StandardOutput {
    public void println(boolean b){
        System.out.println("b");
    }

    public void println(int i){
        System.out.println(i);
    }

    public void println(double d){
        System.out.println(d);
    }

    //method overloading
    public static void main(String[] args){
        StandardOutput output = new StandardOutput();
        output.println(3);
        output.println(true);
        output.println(3.1);
    }
}
