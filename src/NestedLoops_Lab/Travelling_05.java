package NestedLoops_Lab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());;
            double sum = 0;
            while (sum < minBudget) {
                double sumNew = Double.parseDouble(scanner.nextLine());
                sum += sumNew;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}

