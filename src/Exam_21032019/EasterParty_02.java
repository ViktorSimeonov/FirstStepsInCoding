package Exam_21032019;

import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGuest = Integer.parseInt(scanner.nextLine());
        double priceOneCoupon = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double priceCake = 0.1*budget;
        if ( countGuest >= 10 && countGuest <= 15){
            priceOneCoupon*=0.85;
        }else if ( countGuest >16 &&countGuest <= 20){
            priceOneCoupon*=0.8;
        }else if ( countGuest > 20 ){
            priceOneCoupon*=0.75;
        }
        double neededMoney = priceCake + (countGuest*priceOneCoupon);
        if ( budget >= neededMoney ){
            System.out.printf("It is party time! %.2f leva left.",(budget-neededMoney));
        }else {
            System.out.printf("No party! %.2f leva needed.",(neededMoney-budget));
        }
    }
}
