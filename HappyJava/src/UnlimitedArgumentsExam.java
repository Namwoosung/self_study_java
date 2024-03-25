package HappyJava.src;

public class UnlimitedArgumentsExam {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(1, 2, 4));
    }

    public static int sum(int... args){
        System.out.println("prunt1 메소드 - args 길이 : " + args.length);
        int sum = 0;
        for (int arg : args) sum += arg;
        return sum;
    }
}

