package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double places = r*c;
        double price = 0;
        switch (type) {
            case "Premiere":
                price = places * 12;
                break;
            case "Normal":
                price = places * 7.50;
                break;
            case "Discount":
                price = places * 5.00;
                break;
        }
        System.out.printf("%.2f leva",price);
    }
}
