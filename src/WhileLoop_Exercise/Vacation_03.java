package WhileLoop_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int daySpend = 0;
        while (neededMoney > ownedMoney && daySpend < 5) {
            String action = scanner.nextLine();
            double Money = Double.parseDouble(scanner.nextLine());
            days++;
            if (action.equals("save")) {
                ownedMoney += Money;
                daySpend = 0;
            } else if (action.equals("spend")) {
                ownedMoney -= Money;
                daySpend++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
        }
        if (daySpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
