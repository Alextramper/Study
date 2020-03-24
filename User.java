package SomeTask;

import java.util.Scanner;

import static jdk.javadoc.internal.doclets.toolkit.util.Utils.toUpperCase;

public class User {
    private String name;

    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            firstLetterUp(name);
            onlySymbols(name);
        } while (name.isEmpty());
    }

    private static String firstLetterUp(String name) {
        return toUpperCase(name.substring(0,1)) + name.substring(1);
    }

    private static String onlySymbols(String name) {
        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) < 9 || name.charAt(i) > 0) {
                System.out.println("Error, you entered name, which have number");
            }
            break;
        }
        return name;
    }
}
