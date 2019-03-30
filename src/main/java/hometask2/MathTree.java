package hometask2;

public class MathTree {
    public static void main(String[] args) {
        float n = 6.66f;
        float residue = n - (int) n;
        int result;
        if (residue >= 0.5) {
            result = (int) n + 1;
        } else {
            result = (int) n;
        }
        System.out.println(result);
    }
}
