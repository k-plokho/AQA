package hometask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            System.out.println("Give me a name");
            names.add(scanner.next());
        }

        for (int i = 0; i < names.size()-1; i++) {
            if (names.get(i).equals(names.get(i+1))) {
                System.out.println("Match!!!");
            }
            else {
                System.out.println("Not a match");
            }
        }
    }
}