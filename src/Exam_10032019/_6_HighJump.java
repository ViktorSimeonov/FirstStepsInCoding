package Exam_10032019;

import java.util.Scanner;

public class _6_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetHigh = Integer.parseInt(scanner.nextLine());
        int currentHigh = targetHigh - 30;
        int jump = 0;
        int negativJump = 0;
        while (targetHigh >= currentHigh) {
            int attempt = Integer.parseInt(scanner.nextLine());
            jump++;
            if (attempt > currentHigh) {
                currentHigh += 5;
                negativJump=0;
                continue;
            }
            negativJump++;
            if (negativJump == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHigh, jump);
                break;
            }
        }
        if (targetHigh < currentHigh) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", targetHigh, jump);
        }

    }
}
