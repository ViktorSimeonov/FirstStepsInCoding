package ExamRetake_03052019;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sum ;
        double total = 0;
        for (int i = 1; i <= days; i++) {
            sum=0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    sum += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sum += 1.25;
                } else {
                    sum += 1;
                }
            }
                total += sum;
                System.out.printf("Day: %d - %.2f leva%n", i, sum);

        }
        System.out.printf("Total: %.2f leva",total);
    }
}
