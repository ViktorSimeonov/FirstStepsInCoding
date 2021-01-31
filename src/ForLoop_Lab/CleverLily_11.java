package ForLoop_Lab;

import java.util.Scanner;

public class CleverLily_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLili = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        int priceToys = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int toys = 0;
        int gift = 0;
        int brother = 0;
        for (int i = 1; i <= ageLili; i++) {
            if (i % 2 == 0) {
                gift +=10;
                money += gift;
                brother =brother + 1;
            } else {
                toys += priceToys;
            }
        }
        if (((money-brother) + toys) >= priceLaundry) {
            System.out.printf("Yes! %.2f", (((money-brother) + toys) - priceLaundry));
        } else {
            System.out.printf("No! %.2f", (priceLaundry - ((money-brother) + toys)));
        }
    }
}
