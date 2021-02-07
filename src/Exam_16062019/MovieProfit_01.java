package Exam_16062019;

import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int totalDays = Integer.parseInt(scanner.nextLine());
        int ticketsPerDay = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int commission = Integer.parseInt(scanner.nextLine());
        double result = (totalDays*ticketsPerDay*ticketPrice)*(1-(commission)*0.01);
        System.out.printf("The profit from the movie %s is %.2f lv.",movieName,result);
    }
}
