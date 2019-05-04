package lesson6;

import java.util.Arrays;

public class ASCII {
    public static void main(String[] args){
        char[] asciiAr = new char [255];

        for (int i = 0; i == asciiAr.length - 1; i++){
            asciiAr[i] = (char)i;
        }
        System.out.println(Arrays.toString(asciiAr));
    }
}
