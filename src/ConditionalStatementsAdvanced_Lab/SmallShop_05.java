package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        System.out.printf("%.2f", (quantity * 0.50));
                        break;
                    case "Plovdiv":
                        System.out.printf("%.2f", (quantity * 0.40));
                        break;
                    case "Varna":
                        System.out.printf("%.2f", (quantity * 0.45));
                        break;
                }
                break;
        }
        switch (product) {
            case "water":
                switch (city) {
                    case "Sofia":
                        System.out.printf("%.2f", (quantity * 0.80));
                        break;
                    case "Plovdiv":
                        System.out.printf("%.2f", (quantity * 0.70));
                        break;
                    case "Varna":
                        System.out.printf("%.2f", (quantity * 0.70));
                        break;
                }
                break;
        }
        if ("beer".equals(product)) {
            if ("Sofia".equals(city)) {
                System.out.printf("%.2f", (quantity * 1.20));
            } else if ("Plovdiv".equals(city)) {
                System.out.printf("%.2f", (quantity * 1.15));
            } else if ("Varna".equals(city)) {
                System.out.printf("%.2f", (quantity * 1.10));
            }
        }
        if ("sweets".equals(product)) {
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", (quantity * 1.45));
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", (quantity * 1.30));
                    break;
                case "Varna":
                    System.out.printf("%.2f", (quantity * 1.35));
                    break;
            }
        }
        if ("peanuts".equals(product)) {
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", (quantity * 1.60));
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", (quantity * 01.50));
                    break;
                case "Varna":
                    System.out.printf("%.2f", (quantity * 1.55));
                    break;
            }
        }
    }
}
