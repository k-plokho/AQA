package hometask7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Give here a string to count its a's:a ");
        char array[] = userInput.nextLine().toCharArray();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (array[i] == 'a') {
                indexes.add(i);
            }
        }
        System.out.println("The number of your a's: " + indexes.size());
        System.out.println("The indexes of a's in your string are: " + indexes);

    }
}
