package Exam_28032020;

import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numSets = Integer.parseInt(scanner.nextLine());
        double prise = 0;
        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    prise = numSets * 2 * 56.00;
                } else if (size.equals("big")) {
                    prise = numSets * 5 * 28.70;
                }
                break;

            case "Mango":
                if (size.equals("small")) {
                    prise = numSets * 2 * 36.66;
                } else if (size.equals("big")) {
                    prise = numSets * 5 * 19.60;
                }
                break;

            case "Pineapple":
                if (size.equals("small")) {
                    prise = numSets * 2 * 42.10;
                } else if (size.equals("big")) {
                    prise = numSets * 5 * 24.80;
                }
                break;

            case "Raspberry":
                switch (size) {
                    case "small":
                        prise = numSets * 2 * 20.00;
                        break;
                    case "big":
                        prise = numSets * 5 * 15.20;
                        break;
                }
                break;
            default:
                break;
        }if ( prise >= 400 && prise <=1000){
            prise *=0.85;
        }else if ( prise > 1000){
            prise *=0.5;
        }
        System.out.printf("%.2f lv.",prise);

    }
}
