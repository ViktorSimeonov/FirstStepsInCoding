package ExamRetake_03052019;

import java.util.Scanner;

public class _3_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractPeriod = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        double months = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (contractPeriod) {
            case "one":
                switch (typeOfContract) {
                    case "Small":
                        price += 9.98;
                        break;
                    case "Middle":
                        price += 18.99;
                        break;
                    case "Large":
                        price += 25.98;
                        break;
                    case "ExtraLarge":
                        price += 35.99;
                        break;
                }
                if (mobileInternet.equals("yes")) {
                    if (price <= 10) {
                        price += 5.5;
                    } else if (price <= 30) {
                        price += 4.35;
                    } else if (price > 30) {
                        price += 3.85;
                    }

                }
                System.out.printf("%.2f lv.",(price*months));
                break;
            case "two":
                switch (typeOfContract) {
                    case "Small":
                        price += 8.58;
                        break;
                    case "Middle":
                        price += 17.09;
                        break;
                    case "Large":
                        price += 23.59;
                        break;
                    case "ExtraLarge":
                        price += 31.79;
                        break;
                }
                if (mobileInternet.equals("yes")) {
                    if (price <= 10) {
                        price += 5.5;
                    } else if (price <= 30) {
                        price += 4.35;
                    } else if (price > 30) {
                        price += 3.85;
                    }

                }
                System.out.printf("%.2f lv.",((price*months)*0.9625));
                break;
        }
    }
}
