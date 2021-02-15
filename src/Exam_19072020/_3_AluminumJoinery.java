package Exam_19072020;

import java.util.Scanner;

public class _3_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double countOfUnits = Double.parseDouble(scanner.nextLine());
        String typeOfUnits = scanner.nextLine();
        String deliveryWay = scanner.nextLine();
        double price = 0;

        switch (typeOfUnits) {
            case "90X130":
                if (countOfUnits > 30 && countOfUnits <= 59) {
                    price = countOfUnits * 110 * 0.95;
                } else if (countOfUnits > 60) {
                    price = countOfUnits * 110 * 0.92;
                } else if (countOfUnits >= 10) {
                    price = countOfUnits * 110;
                }
                break;
            case "100X150":
                if (countOfUnits > 40 && countOfUnits <= 79) {
                    price = countOfUnits * 140 * 0.94;
                } else if (countOfUnits > 80) {
                    price = countOfUnits * 140 * 0.9;
                } else if (countOfUnits >= 10) {
                    price = countOfUnits * 140;
                }
                break;
            case "130X180":
                if (countOfUnits > 20 && countOfUnits <= 49) {
                    price = countOfUnits * 190 * 0.93;
                } else if (countOfUnits > 50) {
                    price = countOfUnits * 190 * 0.88;
                } else if (countOfUnits >= 10) {
                    price = countOfUnits * 190;
                }
                break;
            case "200X300":
                if (countOfUnits > 25 && countOfUnits <= 49) {
                    price = countOfUnits * 250 * 0.91;
                } else if (countOfUnits > 50) {
                    price = countOfUnits * 250 * 0.86;
                } else if (countOfUnits >= 10) {
                    price = countOfUnits * 250;
                }
                break;
        }
        if (deliveryWay.equals("With delivery")) {
            price += 60;
        }
        if (countOfUnits > 99) {
            price *= 0.96;
        }
        if (countOfUnits < 10) {
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN", price);
        }


    }
}
