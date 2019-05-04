package hometask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("Give me integer #" + i + ": ");
            numbers.add(scanner.nextInt());
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > min) {
                max = numbers.get(i);
            }
            else if (numbers.get(i) > max) {
                min = numbers.get(i);
            }
        }
        System.out.println(min + " is your smallest int. " + max + " is your biggest int.");
    }
}