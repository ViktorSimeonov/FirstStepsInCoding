package NestedLoops_Lab;

import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double allStandard = 0;
        double allStudent = 0;
        double allKid = 0;
        double allBayTicket = 0;
        String movie = scanner.nextLine();
        while (!movie.equals("Finish")) {
            double freePlace = Double.parseDouble(scanner.nextLine());
            String ticket = scanner.nextLine();
            double standard = 0;
            double student = 0;
            double kid = 0;
            double bayTicket = 0;
            while (!ticket.equals("End")) {
                switch (ticket) {
                    case "standard":
                        standard++;
                        break;
                    case "student":
                        student++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                bayTicket = (kid + standard + student);
                if (bayTicket >= freePlace) {
                    break;
                }
                ticket = scanner.nextLine();
            }


            double percentFull = (bayTicket / freePlace) * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentFull);
            movie = scanner.nextLine();
            allBayTicket += bayTicket;
            allStandard += standard;
            allStudent += student;
            allKid += kid;
        }
        System.out.printf("Total tickets: %.0f%n", allBayTicket);
        System.out.printf("%.2f%% student tickets.%n", ((allStudent / allBayTicket)) * 100);
        System.out.printf("%.2f%% standard tickets.%n", ((allStandard / allBayTicket)) * 100);
        System.out.printf("%.2f%% kids tickets.%n", ((allKid / allBayTicket)) * 100);
    }
}
