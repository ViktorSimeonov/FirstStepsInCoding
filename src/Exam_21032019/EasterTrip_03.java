package Exam_21032019;

import java.util.Scanner;

public class EasterTrip_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String timePeriod = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (destination) {
            case "France":
                switch (timePeriod) {
                    case "21-23":
                        price = 30;
                        break;
                    case "24-27":
                        price = 35;
                        break;
                    case "28-31":
                        price = 40;
                        break;
                }
                break;
            case "Italy":
                switch (timePeriod) {
                    case "21-23":
                        price = 28;
                        break;
                    case "24-27":
                        price = 32;
                        break;
                    case "28-31":
                        price = 39;
                        break;
                }

                break;
            case "Germany":
                switch (timePeriod) {
                    case "21-23":
                        price = 32;
                        break;
                    case "24-27":
                        price = 37;
                        break;
                    case "28-31":
                        price = 43;
                        break;
                }
                break;

        } System.out.printf("Easter trip to %s : %.2f leva.",destination,(price*days));
    }
}
