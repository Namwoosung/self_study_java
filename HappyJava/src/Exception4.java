package HappyJava.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Excption4.java");
        }catch(FileNotFoundException fnfe){
            System.out.println("파일 탐색 불가");
        }
    }
}
