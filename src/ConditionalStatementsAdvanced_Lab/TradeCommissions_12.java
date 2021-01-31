package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission;
        if (sales >0) {
            switch (city) {
                case "Sofia":
                    if (sales >= 0 && sales <= 500) {
                        commission = 0.05 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 500 && sales <= 1000) {
                        commission = 0.07 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 1000 && sales <= 10000) {
                        commission = 0.08 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 10000) {
                        commission = 0.12 * sales;
                        System.out.printf("%.2f", commission);
                    }

                    break;
                case "Varna":
                    if (sales >= 0 && sales <= 500) {
                        commission = 0.045 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 500 && sales <= 1000) {
                        commission = 0.075 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 1000 && sales <= 10000) {
                        commission = 0.1 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 10000) {
                        commission = 0.13 * sales;
                        System.out.printf("%.2f", commission);
                    }
                    break;
                case "Plovdiv":
                    if (sales >= 0 && sales <= 500) {
                        commission = 0.055 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 500 && sales <= 1000) {
                        commission = 0.08 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 1000 && sales <= 10000) {
                        commission = 0.12 * sales;
                        System.out.printf("%.2f", commission);
                    } else if (sales > 10000) {
                        commission = 0.145 * sales;
                        System.out.printf("%.2f", commission);
                    }
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }

}
