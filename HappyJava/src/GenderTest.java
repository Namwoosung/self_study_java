package HappyJava.src;

public class GenderTest {
    public static void main(String[] args) {
        Gender gender = Gender.MALE;

        System.out.println(gender); //Gender{chromosome='XY'}
        System.out.println(gender.getChromosome()); //XY
    }
}
