package Exam_07072019;

import java.util.Scanner;

public class _6_NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namePlayer;
        int score =0;
        int bestScore = Integer.MIN_VALUE;
        String bestPlayer="";
        while (!"Stop".equals(namePlayer = scanner.nextLine())) {
            int numberName = namePlayer.length();
            for (int i = 0; i < numberName; i++) {
                int num = Integer.parseInt(scanner.nextLine());
                int letterInt = namePlayer.charAt(i);
                if (num==letterInt){
                    score+=10;
                }else {
                    score+=2;
                }
            }
            if ( score >=bestScore){
                bestScore=score;
                bestPlayer=namePlayer;
            }
            score=0;
        }
        System.out.printf("The winner is %s with %d points!",bestPlayer,bestScore);
    }
}
