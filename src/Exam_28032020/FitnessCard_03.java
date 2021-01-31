package Exam_28032020;

import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double money = 0;
        switch (sport) {
            case "Gym":
                if (sex.equals("m")) {
                    money = 42;
                } else if (sex.equals("f")) {
                    money = 35;
                }
                break;
            case "Boxing":
                if (sex.equals("m")) {
                    money = 41;
                } else if (sex.equals("f")) {
                    money = 37;
                }
                break;
            case "Yoga":
                if (sex.equals("m")) {
                    money = 45;
                } else if (sex.equals("f")) {
                    money = 42;
                }
                break;
            case "Zumba":
                if (sex.equals("m")) {
                    money = 34;
                } else if (sex.equals("f")) {
                    money = 31;
                }
                break;
            case "Dances":
                if (sex.equals("m")) {
                    money = 51;
                } else if (sex.equals("f")) {
                    money = 53;
                }
                break;
            case "Pilates":
                if (sex.equals("m")) {
                    money = 39;
                } else if (sex.equals("f")) {
                    money = 37;
                }
                break;
        }
        if (age <= 19) {
            money *= 0.8;
        }
        if (budget >= money) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else if (money > budget) {
            double notEnoughMoney = money - budget;
            System.out.printf("You don't have enough money! You need $%.2f more.", notEnoughMoney);

        }
    }
}
