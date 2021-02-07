package NestedLoops_MoreExercises;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int maxA = a+c;
        int maxB = b+d;
        int counterA;
        int counterB;
        for (int i = a; i <= maxA; i++) {
            counterA = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    counterA++;
                }
            }
            if (counterA == 2) {
                //System.out.print(i);
                for (int j = b; j <= maxB; j++) {
                    counterB = 0;
                    for (int l = 1; l <= j; l++) {
                        if (j % l == 0) {
                            counterB++;
                        }
                    }
                    if (counterB == 2) {
                        System.out.printf("%d%d",i,j);
                        System.out.println();

                    }
                }
            }
        }
    }
}


