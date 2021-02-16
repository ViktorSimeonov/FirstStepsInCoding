package Exam_19072020;

import java.util.Scanner;

public class _1_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameAgency = scanner.nextLine();
        int adultTicket = Integer.parseInt(scanner.nextLine());
        int childrenTicket = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double taxes = Double.parseDouble(scanner.nextLine());
        double ticketPriceChildren = ticketPrice * 0.3;
        double sum = (ticketPrice * adultTicket) + (childrenTicket * ticketPriceChildren)+
                ((childrenTicket+adultTicket)*taxes);
        double winnings = sum*0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",nameAgency,winnings);
    }
}
