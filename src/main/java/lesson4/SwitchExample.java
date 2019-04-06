package lesson4;

public class SwitchExample {
    public static void main(String[] args) {
        String name = "Jack";
        switch (name) {
            case "Katya":
                name = "one";
                break;
            case "Mirosia":
                name = "two";
                break;
            case "Roma":
                name = "three";
                break;
            default:
                name = "N/A";
                System.out.println(name);
        }
    }
}