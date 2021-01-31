package Exam_21032019;

import java.util.Scanner;

public class EasterEggsBattle_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayerEggs = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggs = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();
        boolean firstNoEggs = false;
        boolean secondNoEggs = false;
        while (!winner.equals("End of battle")) {
            if (winner.equals("one")) {
                secondPlayerEggs--;
                if (secondPlayerEggs == 0) {
                    secondNoEggs = true;
                    break;
                }
            } else if (winner.equals("two")) {
                firstPlayerEggs--;
                if (firstPlayerEggs == 0) {
                    firstNoEggs = true;
                    break;
                }
            }winner=scanner.nextLine();
        }
        if (firstNoEggs) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggs);
        } else if (secondNoEggs) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEggs);
        } else {
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEggs);
            System.out.printf("Player two has %d eggs left.", secondPlayerEggs);
        }
    }
}
