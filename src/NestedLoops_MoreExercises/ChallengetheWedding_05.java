package NestedLoops_MoreExercises;


import java.util.Scanner;

public class ChallengetheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                counter++;
                if (counter <= tables) {
                    System.out.printf("(%d <-> %d) ", i, j);

                }
            }

        }
    }
}
