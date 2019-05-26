package lesson10;

import java.sql.SQLOutput;

public class ExeptionExample {
    public static void main(String[] args) {
        int a=4;
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e){
            System.out.println("Exeption!!! /0");
            System.out.println(a / 1);
        }
    }
}
