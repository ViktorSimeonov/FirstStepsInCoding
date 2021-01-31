package WhileLoopMoreExercises;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedMoney = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int price;
        int sum = 0;
        int payCashCard = 0;
        double payCash = 0;
        double payCard = 0;
        double priceCash = 0;
        double priceCard = 0;
        while (!command.equals("End")) {
            price = Integer.parseInt(command);
            payCashCard++;
            if (payCashCard % 2 == 0) {
                if (price >= 10) {
                    payCard++;
                    priceCard += price;
                    sum += price;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    payCash++;
                    priceCash += price;
                    sum += price;
                    System.out.println("Product sold!");
                }
            }
            if (sum >= expectedMoney) {
                break;
            }
            command = scanner.nextLine();
        }
        if (sum < expectedMoney) {
            System.out.println("Failed to collect required money for charity.");
        }else {
            double cash = priceCash / payCash;
            double card = priceCard / payCard;
            System.out.printf("Average CS: %.2f%n", cash);
            System.out.printf("Average CC: %.2f", card);
        }
    }
}
