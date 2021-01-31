package ConditionalStatementsNested_MoreExercises;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chrysanthemums = Double.parseDouble(scanner.nextLine());
        double roses = Double.parseDouble(scanner.nextLine());
        double tulips = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double priceChrysanthemums;
        double priceRoses;
        double priceTulips;
        double increase;
        double priceAll=0;
        double countAll = chrysanthemums + roses + tulips;
        if (holiday.equals("Y")) {
            increase = 1.15;
            switch (season) {
                case "Spring":
                    priceChrysanthemums = chrysanthemums * 2;
                    priceRoses = roses * 4.10;
                    priceTulips = tulips * 2.50;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips) * increase;
                    if (tulips > 7) {
                        priceAll *= 0.95;
                    }
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
                case "Summer":
                    priceChrysanthemums = chrysanthemums * 2;
                    priceRoses = roses * 4.10;
                    priceTulips = tulips * 2.50;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips) * increase;
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
                case "Autumn":
                    priceChrysanthemums = chrysanthemums * 3.75;
                    priceRoses = roses * 4.50;
                    priceTulips = tulips * 4.15;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips) * increase;
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
                case "Winter":
                    priceChrysanthemums = chrysanthemums * 3.75;
                    priceRoses = roses * 4.50;
                    priceTulips = tulips * 4.15;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips) * increase;
                    if (roses >= 10) {
                        priceAll *= 0.9;
                    }
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
            }
        } else {
            switch (season) {
                case "Spring":
                    priceChrysanthemums = chrysanthemums * 2;
                    priceRoses = roses * 4.10;
                    priceTulips = tulips * 2.50;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips);
                    if (tulips > 7) {
                        priceAll *= 0.95;
                    }
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
                case "Summer":
                    priceChrysanthemums = chrysanthemums * 2;
                    priceRoses = roses * 4.10;
                    priceTulips = tulips * 2.50;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips);
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
                case "Autumn":
                    priceChrysanthemums = chrysanthemums * 3.75;
                    priceRoses = roses * 4.50;
                    priceTulips = tulips * 4.15;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips);
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
                case "Winter":
                    priceChrysanthemums = chrysanthemums * 3.75;
                    priceRoses = roses * 4.50;
                    priceTulips = tulips * 4.15;
                    priceAll = (priceChrysanthemums + priceRoses + priceTulips);
                    if (roses >= 10) {
                        priceAll *= 0.9;
                    }
                    if (countAll > 20) {
                        priceAll *= 0.80;
                    }
                    break;
            }
        }
//                  изход
        System.out.printf("%.2f",(priceAll+2));
    }
}
