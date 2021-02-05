package Exam_16062019;

import java.util.Scanner;

public class LunchBreak_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfMovie = scanner.nextLine();
        int periodOfMovie = Integer.parseInt(scanner.nextLine());
        int periodOfRest = Integer.parseInt(scanner.nextLine());
        double timeLunch = periodOfRest * (1.0 / 8);
        double timeForRest = periodOfRest * (1.0 / 4);
        if (periodOfRest >= (periodOfMovie + timeForRest + timeLunch)) {
            double timeLeft = Math.ceil(periodOfRest - (periodOfMovie + timeForRest + timeLunch));
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfMovie, timeLeft);
        } else {
            double notEnoughTime = Math.ceil((periodOfMovie + timeForRest + timeLunch) - periodOfRest);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameOfMovie,notEnoughTime);
        }

    }
}
