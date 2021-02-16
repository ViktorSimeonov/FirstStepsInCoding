package Exam_19072020;

import java.util.Scanner;

public class _5_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namePlayer;
        String nameOfTheBest = "";
        int theBest = Integer.MIN_VALUE;
        int goals = 0;
        boolean hattrick = false;
        while (!"END".equals(namePlayer = scanner.nextLine())) {
            goals = Integer.parseInt(scanner.nextLine());
            if (goals > theBest) {
                theBest = goals;
                nameOfTheBest = namePlayer;
            }
            if (goals >= 10) {
                break;
            }
        }
        System.out.printf("%s is the best player!%n",nameOfTheBest);
        if (goals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", theBest);
            hattrick = true;
        }
        if (!hattrick) {
            System.out.printf("He has scored %d goals.%n", theBest);
        }

    }
}
