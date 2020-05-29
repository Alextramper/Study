

package SomeTask;


import java.util.Random;
import java.util.Scanner;

public class Riddler {

    public void gameChoose() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        String one = "угадать";
        String two = "загадать";
        System.out.println("Выбери игру:");
        System.out.println("1.Угадать число" +
                "\n" + "2.Загадать число");
        do {
                choose = scanner.nextLine();
                if (choose.equals(one)) {
                    System.out.println("Поехали. Угадай мое число: ");
                    gameOne();
                } else if (choose.equals(two)) {
                    System.out.println("Загадай число, как загадаешь, пиши \"загадал\". " +
                            "Если твое число меньше, пиши \"меньше\", и \"больше\" или \"верно\" соответственно");
                    gameTwo();
                } else {
                    System.out.println("Введи " + ("угадать ") + "или " + ("загадать"));
                }
       } while (choose.equals(one) || choose.equals(two) || !endGame(choose));

    }

    public void gameOne() {
        int unknownNum;
        String userNum = "";
        Scanner num = new Scanner(System.in);
        Random n = new Random();
        unknownNum = n.nextInt(100);

        try {
            do {
                try {
                    userNum = num.next();

                    /*if (userNum.equals("выйти")) {
                        System.out.println("До свидания!");
                        break;
                    }*/
                    if (Integer.parseInt(userNum) > unknownNum) {
                        System.out.println("меньше");
                    } else if (Integer.parseInt(userNum) < unknownNum) {
                        System.out.println("больше");
                    } else {
                        System.out.println("Ты угадал!");
                        gameChoose();
                    }
                } catch(NumberFormatException e) {
                System.out.println();
            }
            } while (!endGame(userNum) || Integer.parseInt(userNum) != unknownNum);
        } catch(NumberFormatException e) {
            System.out.println();
        }
    }

    public void gameTwo() {
        String less = "меньше";
        String more = "больше";
        String right = "верно";
        startGame();
        String unknownNum = "";
        int low = 0;
        int high = 100;
        int middle;
        Scanner num = new Scanner(System.in);

        while (!endGame(unknownNum)) {
            middle = low + (high - low) / 2;
            System.out.println(middle);
            unknownNum = num.nextLine();

            if (unknownNum.equals(less)) {
                high = middle;
            } else if (unknownNum.equals(more)) {
                low = middle;
            } else if (unknownNum.equals(right)) {
                System.out.println("Ура! Спасибо за игру!");
                gameChoose();
            }
        }

    }

    private static void startGame() {
        String start = "загадал";
        String compareWord;
        boolean b = false;
        Scanner n = new Scanner(System.in);
        while (!b) {
            compareWord = n.nextLine();
            if (start.equals(compareWord)) b = true;
        }
    }

    private static boolean endGame(String end) {
        String eq = "выйти";
        boolean res = end.equals(eq);
        if (res) {
            System.out.println("До встречи!");
        }
        return res;
    }
}

