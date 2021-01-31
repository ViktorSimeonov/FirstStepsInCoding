package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());
        double priceStudio;
        double priceApartment;
        if (month.equals("May") || month.equals("October")) {
            priceStudio = countNights * 50;
            priceApartment = countNights * 65;
            if (countNights > 7 && countNights <= 14) {
                priceStudio *= 0.95;
            } else if (countNights > 14) {
                priceStudio *= 0.7;
                priceApartment *= 0.9;
            }
            System.out.printf("Apartment: %.2f lv.", priceApartment);
            System.out.println();
            System.out.printf("Studio: %.2f lv.", priceStudio);
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = countNights * 75.20;
            priceApartment = countNights * 68.70;
            if (countNights > 14) {
                priceStudio *= 0.8;
                priceApartment *= 0.9;
            }
            System.out.printf("Apartment: %.2f lv.", priceApartment);
            System.out.println();
            System.out.printf("Studio: %.2f lv.", priceStudio);
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = countNights * 76;
            priceApartment = countNights * 77;
            if (countNights > 14) {
                priceApartment *= 0.9;
            }
            System.out.printf("Apartment: %.2f lv.", priceApartment);
            System.out.println();
            System.out.printf("Studio: %.2f lv.", priceStudio);
        }
    }
}
