package hometask2;

import java.util.Scanner;

public class ConsoleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a char: ");
        char givenChar = scanner.next().charAt(0);
        System.out.println((int)givenChar);
    }
}
