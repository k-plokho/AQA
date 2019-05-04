package hometask6;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args){
        int[] array = {2, 1, 5, 4};
        for (int i = 1; i < array.length; i++){
            for (int j = i; !(j<1) && array[j-1] > array[j]; j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
