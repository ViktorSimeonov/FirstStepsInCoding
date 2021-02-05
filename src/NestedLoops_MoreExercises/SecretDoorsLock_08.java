package NestedLoops_MoreExercises;

import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hundredsUpLimit = Integer.parseInt(scanner.nextLine());
        int tensUpLimit = Integer.parseInt(scanner.nextLine());
        int unitsUpLimit = Integer.parseInt(scanner.nextLine());
        int count;
        for (int hundreds = 1; hundreds <= hundredsUpLimit; hundreds++) {
            if (hundreds % 2 != 0) {
                continue;
            }
            for (int tens = 1; tens <= tensUpLimit; tens++) {
                count = 0;
                for (int i = 1; i <= tens; i++) {
                    if (tens % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {

                }
                else {
                    continue;
                }

                for (int units = 1; units <= unitsUpLimit; units++) {
                    if (units % 2 != 0) {
                        continue;
                    }
                    System.out.printf("%d %d %d%n", hundreds, tens, units);
                }
            }
        }

    }
}

