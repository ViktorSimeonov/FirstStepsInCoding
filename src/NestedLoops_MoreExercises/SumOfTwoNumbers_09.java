package NestedLoops_MoreExercises;

import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        int count = 0;
        boolean weFoundIt = false;
        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                combination++;
                if ((i + j) == magicNumber) {
                    count++;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combination, i, j, magicNumber);
                    weFoundIt = true;
                    break;
                }
            }
            if(weFoundIt){
                break;
            }
        }
        if (count == 0) {
            System.out.printf("%d combinations - neither equals %d%n", combination, magicNumber);
        }
    }
}


