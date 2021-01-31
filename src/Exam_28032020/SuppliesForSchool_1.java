package Exam_28032020;

import java.util.Scanner;

public class SuppliesForSchool_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPen = Integer.parseInt(scanner.nextLine());
        int numMarker = Integer.parseInt(scanner.nextLine());
        double litreChemistry = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double pricePen = numPen*5.80;
        double priceMarker = numMarker*7.20;
        double priceChemistry = litreChemistry*1.2;
        double priceAll = priceChemistry + priceMarker + pricePen;
        double priceAllCommission = priceAll - priceAll*(discount/(100*1.00) );
        System.out.printf("%.3f",priceAllCommission);

    }
}
