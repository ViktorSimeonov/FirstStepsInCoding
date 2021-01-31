package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerName = scanner.nextLine();
        int countFlower = Integer.parseInt(scanner.nextLine());
        int money = Integer.parseInt(scanner.nextLine());
        double neededMoney = 0;
        switch (flowerName) {
            case "Roses":
                neededMoney = countFlower * 5;
                if (countFlower > 80) {
                    neededMoney *= 0.9;
                }
                break;

            case "Dahlias":
                neededMoney = countFlower * 3.80;
                if (countFlower > 90) {
                    neededMoney *= 0.85;
                }
                break;

            case "Tulips":
                neededMoney = countFlower * 2.80;
                if (countFlower > 80) {
                    neededMoney *= 0.85;
                }
                break;

            case "Narcissus":
                neededMoney = countFlower*3;
                if (countFlower < 120) {
                    neededMoney *= 1.15;
                } break;

            case "Gladiolus":
                neededMoney = countFlower*2.50;
                if (countFlower < 80) {
                    neededMoney *=1.20;
                }
                break;
        }
        if (money >= neededMoney) {
            double leftMoney = money - neededMoney;
            System.out.printf("Hey, you have a great garden " +
                    "with %d %s and %.2f leva left.", countFlower, flowerName, leftMoney);
        } else  {
            double notEnoughMoney = neededMoney - money;
            System.out.printf("Not enough money, you need %.2f leva more.", notEnoughMoney);
        }
    }
}






