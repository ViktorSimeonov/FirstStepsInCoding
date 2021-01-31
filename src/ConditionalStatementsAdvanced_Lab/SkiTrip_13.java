package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class SkiTrip_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        double totalPrice = 0;
        int nights = days - 1;
        double pricePerNight;
        switch (roomType) {
            case "room for one person":
                pricePerNight = 18;
                totalPrice = pricePerNight * nights;
                break;
            case "apartment":
                pricePerNight = 25;
                totalPrice = pricePerNight * nights;
                if (nights < 10) {
                   totalPrice *= 0.70;
                } else if (nights <= 15) {
                    totalPrice *= 0.65;
                } else  {
                    totalPrice *= 0.5;
                }
                break;
            case "president apartment":
                pricePerNight = 35;
                totalPrice = pricePerNight * nights;
                if (nights <10) {
                    totalPrice *= 0.90;
                } else if (nights <= 15) {
                    totalPrice *= 0.85;
                } else  {
                    totalPrice *= 0.8;
                }
                break;
        }
        if (rating.equals("positive")) {
            totalPrice *= 1.25;
        } else if (rating.equals("negative")) {
            totalPrice *= 0.9;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
