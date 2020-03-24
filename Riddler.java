package SomeTask;

import java.util.Scanner;

public class Riddler {
    public static void main(String[] args) {
        System.out.println("Hello,..");

        gameChoose();
    }

    public static int gameChoose() {
        System.out.println("Please, choose the game:");
        System.out.println("1 : Guess my number from 0 to 100" +
            "\n" + "2 : I guess your number from 0 to 100");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        if (choose == 1)
            gameOne();
         /*else if (choose == 2) {
            gameTwo();
        } */else {
            System.out.println("Choose between 1 or 2");
        }
        return gameChoose();
    }

    public static int gameOne() {
        int unknownNum, userNum, TryCount = 0;
        Scanner num = new Scanner(System.in);
        unknownNum = (int) Math.floor(Math.random() * 100);
        do {
            TryCount++;
            System.out.println("Enter you num: ");
            userNum = num.nextInt();
            if (userNum > unknownNum)
                System.out.println("Need less");
            else if (userNum < unknownNum)
                System.out.println("Need more");
            else {
                System.out.println("You're right");
                gameChoose();
                }
        } while (userNum != unknownNum);
        return userNum;

    }

    /*public static int gameTwo() {
    System.out.println("Enter you num: ");
        int progNum, TryCount = 0;
        String unknownNum;
        Scanner num = new Scanner(System.in);
        do {
            TryCount++;
            progNum = (int)Math.floor(Math.random()*100;
            System.out.println(progNum);
            unknownNum = num.nextLine();
            if( unknownNum == "less" )
                progNum = 
        }


    }*/
}
