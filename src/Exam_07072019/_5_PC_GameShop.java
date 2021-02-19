package Exam_07072019;

import java.util.Scanner;

public class _5_PC_GameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soldGames = Integer.parseInt(scanner.nextLine());
        String nameGame;
        int countHearthstone = 0;
        int countFornite = 0;
        int countOverwatch = 0;
        int others = 0;
        for (int i = 1; i <= soldGames; i++) {
            nameGame = scanner.nextLine();
            switch (nameGame) {
                case "Hearthstone":
                    countHearthstone++;
                    break;
                case "Fornite":
                    countFornite++;
                    break;
                case "Overwatch":
                    countOverwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", (countHearthstone * 1.0 / soldGames) * 100);
        System.out.printf("Fornite - %.2f%%%n", (countFornite * 1.0 / soldGames) * 100);
        System.out.printf("Overwatch - %.2f%%%n", (countOverwatch * 1.0 / soldGames) * 100);
        System.out.printf("Others - %.2f%%%n", (others * 1.0 / soldGames) * 100);
    }
}
