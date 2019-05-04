package lesson6;

import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String [] args){

        int ar[] = {4,3,2,-5,44,5,6};
        for (int n = 0; n < ar.length-1; n++){
            for(int i = 0; i < ar.length-1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int arTemp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = arTemp;
                }
            }

        }
        System.out.println(Arrays.toString(ar));
    }
}
