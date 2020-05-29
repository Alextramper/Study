package SomeTask;

import java.util.Arrays;
import java.util.Scanner;

public class User {

    public void userReg() {
        boolean res2;
        String name;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя: ");
            name = scanner.nextLine();
            res2 = onlyLetters(name);
        } while (res2 || name.isEmpty());
        name = firstLetterUp(name);

        System.out.println("Привет, " + name + ".");
    }

    public static String firstLetterUp(String name) {
            String a = name.substring(0, 1);
            String result = a.toUpperCase() + name.substring(1);
            return result;
    }

    public static boolean onlyLetters(String name) {
        String[] array = {"1", "2", "3", "4", "5","6","7","8","9","0"};
        boolean result = Arrays.stream(array).anyMatch(e -> name.contains(e));
        if (result) {
            System.out.println("Ошибка, цифра в имени");
        }
        return result;
    }

}
