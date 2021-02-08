package Exam_16062019;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (destination) {
            case "Dubai":
                switch (season) {
                    case "Winter":
                        price = days * 45000;
                        break;
                    case "Summer":
                        price = days * 40000;
                        break;
                }
                price *= 0.7;
                break;
            case "Sofia":
                switch (season) {
                    case "Winter":
                        price = days * 17000;
                        break;
                    case "Summer":
                        price = days * 12500;
                        break;
                }
                price *= 1.25;
                break;
            case "London":
                switch (season) {
                    case "Winter":
                        price = days * 24000;
                        break;
                    case "Summer":
                        price = days * 20250;
                        break;
                }
                break;

        }
        if (budget >= price) {
            double moreMoney = budget - price;
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", moreMoney);
        } else {
            double notEnoughMoney = price - budget;
            System.out.printf("The director needs %.2f leva more!", notEnoughMoney);
        }
    }
}
