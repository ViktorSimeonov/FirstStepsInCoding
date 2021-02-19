package Exam_10032019;

import java.util.Scanner;

public class _2_FootballResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        int lost = 0;
        int equal = 0;
        for (int i = 1; i <= 3; i++) {
            String game = sc.nextLine();
            int firstTeam = game.charAt(0);
            int secondTeam = game.charAt(2);
            if (firstTeam > secondTeam) {
win++;
            }else if (secondTeam>firstTeam){
                lost++;
            }else {
                equal++;
            }
        }
        System.out.printf("Team won %d games.%n",win);
        System.out.printf("Team lost %d games.%n",lost);
        System.out.printf("Drawn games: %d%n",equal);
    }
}
