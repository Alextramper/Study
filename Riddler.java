//дДОБАВИТЬ КОНСТРУКТОРЫ И СОЗДАТЬ НОВЫЙ ОБЪЕДИНЯЮЩИЙ КЛАСС
// стр 269

package SomeTask;

import java.util.Scanner;
import java.lang.Math;

public class Riddler {
    public static void main(String[] args) {
        System.out.println("Привет, ");
        gameChoose();
    }
    public static void gameChoose() {
        String choose;
        String one = "Угадать";
        String two = "Загадать";
        do { System.out.println("Выбери игру:");
           System.out.println("1. Угадай число" +
                   "\n" + "2. Загадай число");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextLine();
            if (choose == one)
                gameOne();
            else if (choose == two) {
                gameTwo();
            }else {
                System.out.println("Введи" + ("Угадать") + "или" + ("Загадать"));
            }

       } while (choose != one && choose != two);

    }

    public static void gameOne() {
        int unknownNum, userNum;
        Scanner num = new Scanner(System.in);
        unknownNum = (int)Math.random() * 101;
        String end = num.nextLine();
        do {
            System.out.println("Поехали. Угадай мое число: ");
            userNum = num.nextInt();
            if (userNum > unknownNum)
                System.out.println("меньше");
            else if (userNum < unknownNum)
                System.out.println("больше");
            else {
                System.out.println("Ты угадал!");
                gameChoose();
                }
        } while (userNum != unknownNum || endGame(end));
    }

    public static void gameTwo() {
        System.out.println("Загадай число, как загадаешь, дай знать");
        String a = "загадал";
        String less = "меньше";
        String more = "больше";
        startGame(a);
        String unknownNum;
        int array[] = new int[100];
        int low = 0;
        int high = array.length -1;
        Scanner num = new Scanner(System.in);

        while(low <= high) {
            int middle = low + (high - low) / 2;
            unknownNum = num.nextLine();
            System.out.println(middle);

            if (unknownNum == less) {
                high = middle - 1;
            } else if (unknownNum == more)
            low = middle + 1;
        }
    }

    private static void startGame(String start) {
        Scanner n = new Scanner(System.in);
        start = n.nextLine();
    }

    private static boolean endGame(String end) {
        if (end == "выйти")
            return true;
        return false;
    }

}

