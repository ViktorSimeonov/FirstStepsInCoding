package NestedLoops_MoreExercises;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int counterI;
        int counterJ;
        for (int i = a; i <= (a + c); i++) {
            counterI = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    counterI++;
                }
            }
            if (counterI == 2) {
                System.out.print(i);
                for (int j = b; j <= (b + d); j++) {
                    counterJ = 0;
                    for (int l = 1; l <= j; l++) {
                        if (j % l == 0) {
                            counterJ++;
                        }
                    }
                    if (counterJ == 2) {
                        System.out.print(j);
                        System.out.println();
                    }
                }
            }
        }
    }
}


