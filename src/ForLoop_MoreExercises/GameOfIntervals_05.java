package ForLoop_MoreExercises;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());
        double to9 = 0;
        double to19 = 0;
        double to29 = 0;
        double to39 = 0;
        double to50 = 0;
        double invalidNum = 0;
        double result = 0;
        for (int i = 1; i <= moves; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num >= 0 && num < 10) {
                to9++;
                result += (num * 0.2);
            } else if (num >= 10 && num < 20) {
                result += (num * 0.3);
                to19++;
            } else if (num >= 20 && num < 30) {
                result += (num * 0.4);
                to29++;
            } else if (num >= 30 && num < 40) {
                result += 50;
                to39++;
            } else if (num >= 40 && num <= 50) {
                result += 100;
                to50++;
            } else if (num < 0 || num > 50) {
                result = (result / 2);
                invalidNum++;
            }

        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", ((to9 / moves) * 100));
        System.out.printf("From 10 to 19: %.2f%%%n", ((to19 / moves) * 100));
        System.out.printf("From 20 to 29: %.2f%%%n", ((to29 / moves) * 100));
        System.out.printf("From 30 to 39: %.2f%%%n", ((to39 / moves) * 100));
        System.out.printf("From 40 to 50: %.2f%%%n", ((to50 / moves) * 100));
        System.out.printf("Invalid numbers: %.2f%%%n", ((invalidNum / moves) * 100));
    }
}
