package Exam_21032019;

import java.util.Scanner;

public class EasterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customers = Integer.parseInt(scanner.nextLine());
        String product;
//        double basket = 0;
//        double wreath = 0;
//        double chocolateBunny = 0;
        double sum;
        int counter;
        double sumAll = 0;
        for (int i = 0; i < customers; i++) {
            sum = 0;
            counter = 0;

            while (!"Finish".equals(product = (scanner.nextLine()))) {
                counter++;
                switch (product) {
                    case "basket":
                        sum += 1.5;
                        break;
                    case "wreath":
                        sum += 3.8;
                        break;
                    case "chocolate bunny":
                        sum += 7;
                        break;
                }
            }
            if (counter % 2 == 0){
                sum*=0.8;
            }
                System.out.printf("You purchased %d items for %.2f leva.%n", counter, sum);
            sumAll += sum;
        }
        System.out.printf("Average bill per client is: %.2f leva.%n", (sumAll / customers));

    }

}
