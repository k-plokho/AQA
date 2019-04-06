package lesson4;

public class WhileExample {
    public static void  main(String[] args){
        int i = 1;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }

        int a = 1;
        do {
            a++;
            System.out.print(a + " ");
        } while (a < 5);
    }
}
