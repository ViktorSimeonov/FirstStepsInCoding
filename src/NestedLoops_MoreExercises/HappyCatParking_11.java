package NestedLoops_MoreExercises;

import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sumDay ;
        double sumAll = 0;
        for (int i = 1; i <= days; i++) {
            sumDay = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    sumDay += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sumDay += 1.25;
                } else {
                    sumDay += 1;
                }

            }sumAll += sumDay;

            System.out.printf("Day: %d - %.2f leva%n", i, sumDay);
        }
        System.out.printf("Total: %.2f leva", sumAll);
    }
}
