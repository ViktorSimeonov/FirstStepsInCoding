package SimpleConditions_ExamProblems_3_2;

import java.util.Scanner;

public class PipesInPool_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double vP1 = H * P1;
        double vP2 = H * P2;
        double vp1p2 = (P1+P2)*H;
        if (V >= vp1p2) {
            double percentP1 = Math.floor((vP1) / vp1p2 * 100);
            double percentP2 = Math.floor((vP2)/ vp1p2 * 100);
            double fullPercent = Math.floor(vp1p2 / V * 100);
                  System.out.printf("The pool is %.0f%% full.Pipe 1: %.0f%%. Pipe 2: %.0f%%.", fullPercent, percentP1, percentP2);
        } else {
            System.out.printf("For %.1f hours the pool overflows with %.0f liters.", H, (vp1p2 - V));

        }
    }
}
