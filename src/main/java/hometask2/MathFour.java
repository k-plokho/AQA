package hometask2;

public class MathFour {
    public static void main(String[] args) {
        int n = 267;
        String nString = String.valueOf(n);
        char[] nCharArray = nString.toCharArray();
        int a = Integer.parseInt(String.valueOf(nCharArray[0]));
        int b = Integer.parseInt(String.valueOf(nCharArray[1]));
        int c = Integer.parseInt(String.valueOf(nCharArray[2]));
        int sum = a + b + c;
        System.out.println(sum);
    }
}