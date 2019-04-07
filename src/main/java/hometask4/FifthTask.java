package hometask4;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        System.out.println("Give me an int from 1 to 12:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "It's WINTER!!!";
                break;
            case 3:
            case 4:
            case 5:
                season = "It's SPRING!!!";
                break;
            case 6:
            case 7:
            case 8:
                season = "It's SUMMER!!!";
                break;
            case 9:
            case 10:
            case 11:
                season = "It's FALL!!!";
                break;
            default:
                season = "ENTER A VALID INT!!!!!!!!!!!!!!!!!!!!";
                break;
        }
        System.out.println(season);
    }
}
