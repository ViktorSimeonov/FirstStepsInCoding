package ExamRetake_03052019;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String nameProduct;
        int count = 0;
        double priceAllProducts = 0;
        while (!"Stop".equals(nameProduct = scanner.nextLine())) {
            double priceProduct = Double.parseDouble(scanner.nextLine());
            count++;
            if (count % 3 == 0) {
                priceProduct *= 0.5;
            }
            if (budget >= priceProduct) {
                priceAllProducts += priceProduct;
                budget -= priceProduct;
            } else if (budget < priceProduct) {
                double notEnoughMoney = Math.abs(budget - priceProduct);
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", notEnoughMoney);
                break;
            }
        }
        if (nameProduct.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", count, priceAllProducts);
        }
    }
}


