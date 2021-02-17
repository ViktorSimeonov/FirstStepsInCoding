package Exam_10032019;

import java.util.Scanner;

public class _5_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfTournament = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int countWin=0;
        int pointsWin=0;
        for (int i = 1; i <= countOfTournament; i++) {
            String tournament = scanner.nextLine();
            switch (tournament){
                case "W":
                    initialPoints+=2000;
                    pointsWin+=2000;
                    countWin++;
                    break;
                case "F":
                    initialPoints+=1200;
                    pointsWin+=1200;
                    break;
                case "SF":
                    initialPoints+=720;
                    pointsWin+=720;
                    break;
            }
        }
        double averagePoint = Math.floor(pointsWin*1.0/countOfTournament);
        double percentWin = (countWin*1.0/countOfTournament)*100;
        System.out.printf("Final points: %d%n",initialPoints);
        System.out.printf("Average points: %.0f%n",averagePoint);
        System.out.printf("%.2f%%%n",percentWin);
    }
}
