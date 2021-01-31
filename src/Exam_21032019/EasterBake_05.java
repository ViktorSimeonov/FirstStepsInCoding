package Exam_21032019;

import java.util.Scanner;

public class EasterBake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numKozunaci = Integer.parseInt(scanner.nextLine());
        double sugar = 0;
        double flour = 0;
        double maxSugar = Integer.MIN_VALUE;
        double maxFlour = Integer.MIN_VALUE;
        double packSugar;
        double packFlour;
        double allSugar=0;
        double allFlour=0;
        for (int i = 0; i < numKozunaci; i++) {
            sugar = Integer.parseInt(scanner.nextLine());
            allSugar += sugar;
            flour = Integer.parseInt(scanner.nextLine());
            allFlour += flour;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }

            if (flour > maxFlour) {
                maxFlour = flour;
            }

        }
        packSugar = Math.ceil(allSugar / 950);
        packFlour = Math.ceil(allFlour / 750);
        System.out.printf("Sugar: %.0f%n", packSugar);
        System.out.printf("Flour: %.0f%n", packFlour);
        System.out.printf("Max used flour is %.0f grams, max used sugar is %.0f grams.%n", maxFlour, maxSugar);
    }
}
