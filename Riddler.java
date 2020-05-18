

package SomeTask;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Riddler {
    boolean end;

    public void gameChoose() {
        String choose;
        String one = "угадать";
        String two = "загадать";
        do { System.out.println("Выбери игру:");
           System.out.println("1. Угадать число" +
                   "\n" + "2. Загадать число");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextLine();
            if( choose.equals(one) )
                gameOne();
            else if (choose.equals(two)) {
                gameTwo();
            }else {
                System.out.println("Введи " + ("угадать ") + "или " + ("загадать"));
            }

       } while ( !choose.equals(one) || !choose.equals(two) );

    }

    public void gameOne() {
           int unknownNum;
           String userNum;
        Scanner num = new Scanner(System.in);
        Random n = new Random();
        unknownNum = n.nextInt(100);
        System.out.println("Поехали. Угадай мое число: ");
        int i;

        do {
            userNum = num.nextLine();
            end = endGame(userNum);
             i = Integer.parseInt(userNum);
            if (i > unknownNum)
                System.out.println("меньше");
            else if (i < unknownNum)
                System.out.println("больше");
            else {
                System.out.println("Ты угадал!");
                gameChoose();
                }
        } while (i != unknownNum || !end);
    }

    public void gameTwo() {
        System.out.println("Загадай число, как загадаешь, напиши \"загадал\"");
        String a = "загадал";
        String less = "меньше";
        String more = "больше";
        startGame(a);
        String unknownNum;
        int low = 0;
        int high = 100;
        int middle;
        Scanner num = new Scanner(System.in);

        while (!end) {
            middle = low + (high - low) / 2;
            System.out.println(middle);
            unknownNum = num.nextLine();
            end = endGame(unknownNum);

            if (unknownNum.equals("меньше")) {
                high = middle;
            } else if (unknownNum.equals("больше")) {
                low = middle;
            } else if (unknownNum.equals("верно")) {
                System.out.println("Ура! Спасибо за игру, чувак!");
                gameChoose();
            }
        }

    }

    private static void startGame(String start) {
        Scanner n = new Scanner(System.in);
        start = n.nextLine();
    }

    private static boolean endGame(String end) {
        String eq = "выйти";
        Boolean res = end.equals(eq);
        if (res) {
            System.out.println("До встречи!");
        }
        return res;
    }

}

