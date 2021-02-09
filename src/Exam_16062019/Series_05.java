package Exam_16062019;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countSerials = Integer.parseInt(scanner.nextLine());
        double priceAllSerials = 0;
        double difference = 0;
        for (int i = 1; i <= countSerials; i++) {
            String nameSerial = scanner.nextLine();
            double priceSerial = Double.parseDouble(scanner.nextLine());
            switch (nameSerial) {
                case "Thrones":
                    priceSerial *= 0.5;
                    break;
                case "Lucifer":
                    priceSerial *= 0.6;
                    break;
                case "Protector":
                    priceSerial *= 0.7;
                    break;
                case "TotalDrama":
                    priceSerial *= 0.8;
                    break;
                case "Area":
                    priceSerial *= 0.9;
                    break;
            }
            priceAllSerials += priceSerial;
        }
        if (budget >= priceAllSerials) {
            difference = budget - priceAllSerials;
            System.out.printf("You bought all the series and left with %.2f lv.",difference);
        }else {
            difference = priceAllSerials - budget;
            System.out.printf("You need %.2f lv. more to buy the series!",difference);
        }
    }
}
