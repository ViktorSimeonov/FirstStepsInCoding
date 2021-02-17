package Exam_10032019;

import java.util.Scanner;

public class _6_BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentName;
        int winGames=0;
        int allGames=0;
        while (!"End of tournaments".equals(tournamentName = scanner.nextLine())){
        int countOfGames = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= countOfGames; i++) {
                allGames++;
                int pointsDesyTeam = Integer.parseInt(scanner.nextLine());
                int enemyPoints = Integer.parseInt(scanner.nextLine());
                if ( pointsDesyTeam >= enemyPoints){
                    winGames++;
                    System.out.printf("Game %d of tournament %s:" +
                            " win with %d points.%n",i,tournamentName,(pointsDesyTeam-enemyPoints));
                }else {
                    System.out.printf("Game %d of tournament %s:" +
                            " lost with %d points.%n",i,tournamentName,(enemyPoints-pointsDesyTeam));
                }

            }

        }
        System.out.printf("%.2f%% matches win%n",((winGames*1.0/allGames)*100));
        System.out.printf("%.2f%% matches lost%n",(100-(winGames*1.0/allGames)*100));
    }
}
