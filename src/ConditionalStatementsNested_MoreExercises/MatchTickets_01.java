package ConditionalStatementsNested_MoreExercises;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int fans = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double transport = 0;
        switch (category) {
            case "VIP":
                if (fans >= 1 && fans < 5) {
                    price = 499.99 * fans;
                    transport = budget * 0.75;
                } else if (fans >= 5 && fans < 10) {
                    price = 499.99 * fans;
                    transport = budget * 0.6;
                } else if (fans >= 10 && fans < 25) {
                    price = 499.99 * fans;
                    transport = budget * 0.5;
                } else if (fans >= 25 && fans < 50) {
                    price = 499.99 * fans;
                    transport = budget * 0.4;
                } else {
                    price = 499.99 * fans;
                    transport = budget * 0.25;
                }
                break;
            case "Normal":
                if (fans >= 1 && fans < 5){
                    price = 249.99* fans;
                    transport = budget * 0.75;
                } else if (fans >= 5 && fans < 10) {
                    price = 249.99* fans;
                    transport = budget * 0.6;
                } else if (fans >= 10 && fans < 25) {
                    price = 249.99* fans;
                    transport = budget * 0.5;
                } else if (fans >= 25 && fans < 50) {
                    price = 249.99* fans;
                    transport = budget * 0.4;
                } else {
                    price = 249.99* fans;
                    transport = budget * 0.25;
                }
                break;
        }
        if ((price + transport) < budget) {
            System.out.printf("Yes! You have %.2f leva left.", (budget-(price + transport)));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ((price + transport)-budget));
        }
    }
}
