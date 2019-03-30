package hometask2;

public class Privedenie {

    public static void main(String[] args) {
        intToChar();
        floatToChar();
        floatToCharToInt();
    }

    public static void intToChar() {
        //int->char
        int original = 65;
        char converted = (char) original;
        char char2 = (char) 66;

        System.out.println(converted);
    }

    public static void floatToChar() {
        //float->char
        char converted = (char) 88.72f;

        System.out.println(converted);
    }

    public static void floatToCharToInt() {
        //float->char->int
        float original = 14.88f;
        char converted = (char) original;
        int convertedFinal = (int) converted;

        System.out.println(convertedFinal);

    }

}
