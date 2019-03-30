package hometask2;

import java.util.Scanner;

public class ConsoleInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an int: ");
        int givenChar = scanner.nextInt();
        System.out.println((char)givenChar);
    }
}
