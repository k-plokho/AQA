package hometask2;

public class MathTwo {
    public static void main(String[] args) {
        int n = 26;
        String nString = String.valueOf(n);
        char[] nCharArray = nString.toCharArray();
        int a = Integer.parseInt(String.valueOf(nCharArray[0]));
        int b = Integer.parseInt(String.valueOf(nCharArray[1]));
        int sum = a + b;
        System.out.println(sum);
    }
}