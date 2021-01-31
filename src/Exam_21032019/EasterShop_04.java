package Exam_21032019;

import java.util.Scanner;

public class EasterShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEggs = Integer.parseInt(scanner.nextLine());
        String buyFill;
        boolean buySell = false;
        int sellEggs = 0;
        while (!"Close".equals(buyFill = scanner.nextLine())) {
            int eggWantToBuy = Integer.parseInt(scanner.nextLine());
            switch (buyFill) {
                case "Buy":
                    if (eggWantToBuy > numberOfEggs) {
                        buySell = true;
                        break;
                    }
                    sellEggs += eggWantToBuy;
                    numberOfEggs -= eggWantToBuy;
                    break;
                case "Fill":
                    numberOfEggs += eggWantToBuy;
                    break;
            }
            if (buySell) {
                break;
            }
        }
        if (buySell) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", numberOfEggs);
        } else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", sellEggs);
        }
    }
}
