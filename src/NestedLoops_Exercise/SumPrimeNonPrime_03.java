package NestedLoops_Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sumPrime = 0;
        int sumNonPrime = 0;
        int count ;
        while (!"stop".equals(input = (scanner.nextLine()))) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                continue;
            }
            count = 0;
            // просто число има 2 делителя едно и себе си
            // непросто има повече от 2 делителя
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }if (count == 2) {
                sumPrime += number;
            } else if (count > 2) {
                sumNonPrime += number;
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
