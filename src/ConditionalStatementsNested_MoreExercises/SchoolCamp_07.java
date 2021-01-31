package ConditionalStatementsNested_MoreExercises;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        double students = Double.parseDouble(scanner.nextLine());
        double nights = Double.parseDouble(scanner.nextLine());
        double price = 0;
        String sport = "";
               // WINTER
        if ("Winter".equals(season)) {
            if ("girls".equals(typeGroup)) {
                price = nights * students * 9.60;
                sport = "Gymnastics";
            } else if ("boys".equals(typeGroup)) {
                price = nights * students * 9.60;
                sport = "Judo";
            } else if ("mixed".equals(typeGroup)) {
                price = nights * students * 10;
                sport = "Ski";
            }
            // SPRING
        } else if ("Spring".equals(season)) {
            if ("girls".equals(typeGroup)) {
                price = nights * students * 7.20;
                sport = "Athletics";
            } else if ("boys".equals(typeGroup)) {
                price = nights * students * 7.20;
                sport = "Tennis";
            } else if ("mixed".equals(typeGroup)) {
                price = nights * students * 9.50;
                sport = "Cycling";
            }
            // SUMMER
        } else if ("Summer".equals(season)) {
            if ("girls".equals(typeGroup)) {
                price = nights * students * 15;
                sport = "Volleyball";
            } else if ("boys".equals(typeGroup)) {
                price = nights * students * 15;
                sport = "Football";
            } else if ("mixed".equals(typeGroup)) {
                price = nights * students * 20;
                sport = "Swimming";
            }
        }
        if (students >= 50) {
            price *= 0.5;
        } else if (students >= 20 && students < 50) {
            price *= 0.85;
        } else if (students >= 10 && students < 20) {
            price *= 0.95;
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}
