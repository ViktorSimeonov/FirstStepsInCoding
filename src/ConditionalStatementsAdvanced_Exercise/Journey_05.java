package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String typeVacation = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budget *= 0.30;
                typeVacation = "Camp";
            } else if (season.equals("winter")) {
                budget *= 0.70;
                typeVacation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                budget *= 0.40;
                typeVacation = "Camp";
            } else if (season.equals("winter")) {
                budget *= 0.80;
                typeVacation = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            typeVacation = "Hotel";
            budget *= 0.9;
        }
        System.out.printf("Somewhere in %s",destination);
        System.out.println();
        System.out.printf("%s - %.2f",typeVacation,budget);

    }
}
