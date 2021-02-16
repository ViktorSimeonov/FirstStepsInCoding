package Exam_19072020;

import java.util.Scanner;

public class _2_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOBags = Double.parseDouble(scanner.nextLine());
        double kilogramsOfBags = Double.parseDouble(scanner.nextLine());
        int daysUntil = Integer.parseInt(scanner.nextLine());
        int peacesOfBags = Integer.parseInt(scanner.nextLine());
        double additionalPrice = 0;
        if (kilogramsOfBags<10){
            additionalPrice+=(priceOBags*0.2);
        }else if ( kilogramsOfBags<=20){
            additionalPrice+=(priceOBags*0.5);
        }else {
            additionalPrice=priceOBags;
        }
        if (daysUntil>30){
            additionalPrice*=1.1;
        }else if ( daysUntil >=7){
            additionalPrice*=1.15;
        }else if ( daysUntil <7){
            additionalPrice*=1.4;
        }
        System.out.printf("The total price of bags is: %.2f lv.",(additionalPrice*peacesOfBags));
    }
}
