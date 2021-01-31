package NestedLoops_Lab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        int count = 0;
        boolean weFoundIt = false;
        for (int i = beginInterval; i <= endInterval; i++) {
            for (int j = beginInterval; j <= endInterval; j++) {
                counter++;
                if (i + j == magicNumber) {
                    count++;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, magicNumber);
                    weFoundIt = true;
                    break;
                }
            }
            if (weFoundIt) {
                break;
            }
        }
        if (count == 0) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
