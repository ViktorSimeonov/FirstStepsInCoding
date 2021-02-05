package Exam_10032019;

import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String tool = scanner.nextLine();
        double totalScore = 0;

        switch (country) {
            case "Russia":
                switch (tool) {
                    case "ribbon":
                        totalScore = 9.1 + 9.4;
                        break;
                    case "hoop":
                        totalScore = 9.3 + 9.8;
                        break;
                    case "rope":
                        totalScore =9.6+9.0;
                        break;
                }
                break;
            case "Bulgaria":
                switch (tool) {
                    case "ribbon":
                        totalScore =9.6+9.4;
                        break;
                    case "hoop":
                        totalScore =9.55+9.75;
                        break;
                    case "rope":
                        totalScore = 9.5+9.4;
                        break;
                }
                break;
            case "Italy":
                switch (tool) {
                    case "ribbon":
                        totalScore =9.2+9.5;
                        break;
                    case "hoop":
                        totalScore =9.45+9.35;
                        break;
                    case "rope":
                        totalScore =9.7+9.15;
                        break;
                }
                break;
        }
        double neededPercent = ((20-totalScore)/20)*100;
        System.out.printf("The team of %s get %.3f on %s.%n",country,totalScore,tool);
        System.out.printf("%.2f%%",neededPercent);
    }
}
