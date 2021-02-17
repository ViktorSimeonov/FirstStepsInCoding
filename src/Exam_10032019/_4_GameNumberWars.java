package Exam_10032019;

import java.util.Scanner;

public class _4_GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFirstPlayer = scanner.nextLine();
        String nameSecondPlayer = scanner.nextLine();
        String firstCard;
        int pointFirst = 0;
        int pointsSecond = 0;
        while (!"End of game".equals(firstCard = scanner.nextLine())) {
            int firstPlayerCard = Integer.parseInt(firstCard);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());
            if (firstPlayerCard > secondPlayerCard) {
                pointFirst += (firstPlayerCard - secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                pointsSecond += (secondPlayerCard - firstPlayerCard);
            } else {
                System.out.println("Number wars!");
                firstPlayerCard = Integer.parseInt(scanner.nextLine());
                secondPlayerCard = Integer.parseInt(scanner.nextLine());
                if (firstPlayerCard > secondPlayerCard) {
                    System.out.printf("%s is winner with %d points%n", nameFirstPlayer, pointFirst);
                } else {
                    System.out.printf("%s is winner with %d points%n", nameSecondPlayer, pointsSecond);
                }
                break;
            }

        }
        if ("End of game".equals(firstCard)) {
            System.out.printf("%s has %d points%n", nameFirstPlayer, pointFirst);
            System.out.printf("%s has %d points%n", nameSecondPlayer, pointsSecond);
        }
    }
}
