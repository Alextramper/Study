package SomeTask;
import java.util.Arrays;
import java.util.Scanner;


public class User {
    String name;

    public static void main(String[] args) {
        boolean res2;
        String name;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя: ");
            name = scanner.nextLine();
            firstLetterUp(name);
            res2 = onlyLetters(name);
        } while (res2 || name.isEmpty());
    }

    public static void firstLetterUp(String name) {
        if (!name.isEmpty()) {
            String a = name.substring(0, 1);
            String result = a.toUpperCase() + name.substring(1);
        }
    }

    public static boolean onlyLetters(String name) {
        String[] array = {"1", "2", "3", "4", "5","6","7","8","9","0"};
        Boolean result = Arrays.stream(array).anyMatch(e -> name.contains(e));
        if (result) {
            System.out.println("Ошибка, число в имени");
        }
        return result;
    }

}
