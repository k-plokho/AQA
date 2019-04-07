package hometask4;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Give me first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Give me second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Give me third number:");
        int thirdNumber = scanner.nextInt();
        System.out.println("Give me fourth number:");
        int fourthNumber = scanner.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber){
            System.out.println(firstNumber);
        }
        else if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber){
            System.out.println(secondNumber);
        }
        else if (thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber){
            System.out.println(thirdNumber);
        }
        else if (fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber){
            System.out.println(fourthNumber);
        }
        else{
            System.out.println("Equals!!!");
        }
    }
}
