package hometask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Give me integer #" + i + ": ");
            numbers.add(scanner.nextInt());
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        int countMax = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == max) {
                countMax++;
            }
        }
        System.out.println(countMax + " times of " + max);
    }
}