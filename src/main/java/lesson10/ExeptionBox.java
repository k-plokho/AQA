//package lesson10;
//
//import javax.swing.*;
//
//public class ExeptionBox {
//    throw new SomeException(); // Синтаксис
//    /////////////////////////////////////////////////////////////////////
//    static Box box;
//    public static void makeSomeMagic() {
//        if(box == null){
//            throw new NullPointerException("BOX не инициализирован!");
//        }
//    }
//
//    public static void procA() {
//        try {
//            System.out.println("inside procA");
//            throw new RuntimeException("demo");
//        } finally {
//            System.out.println("procA's finally");
//        }
//    }
//    public static String getSurname(String nameAndSurname){
//        String surname = nameAndSurname.split(" ")[1];
//        try {
//            return surname;
//        } finally {
//            System.out.println(surname);
//        }
//    }
//
//    public static void main(String[] args) {
//        procA();
//    }
//}
