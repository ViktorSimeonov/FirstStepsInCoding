package Exam_28032020;

import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfGame = scanner.nextLine();
        int dayOfTournament = Integer.parseInt(dayOfGame);
        String nameOfGame;
        String winLose;
        int winDays = 0;
        int loseDays = 0;
        double sumDays=0;
        for (int i = 1; i <= dayOfTournament; i++) {
            int countWin = 0;
            int countLose = 0;
            double sum = 0;
            while (!"Finish".equals(nameOfGame = scanner.nextLine())) {
                winLose = scanner.nextLine();
                if ("win".equals(winLose)) {
                    countWin++;
                    sum += 20;
                } else if ("lose".equals(winLose)) {
                    countLose++;
                }

            }
            if (countWin > countLose) {
                sum *= 1.1;
                winDays++;
            } else {
                loseDays++;
            }sumDays+=sum;
        }
        if ( winDays > loseDays){
            sumDays*=1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f",sumDays);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",sumDays);
        }

    }
}
