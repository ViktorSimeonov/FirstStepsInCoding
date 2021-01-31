package ConditionalStatementsNested_MoreExercises;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double paycheck = 0;
        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    paycheck = km * 0.75 * 4 * 0.9;
                } else if (km > 5000 && km <= 10000) {
                    paycheck = km * 0.95 * 4 * 0.9;
                } else {
                    paycheck = km * 1.45 * 4 * 0.9;
                }
                break;
            case "Summer":
                if (km <= 5000) {
                    paycheck = km * 0.9 * 4 * 0.9;
                } else if (km > 5000 && km <= 10000) {
                    paycheck = km * 1.10 * 4 * 0.9;
                } else {
                    paycheck = km * 1.45 * 4 * 0.9;
                }
                break;
            case "Winter":
                if (km <= 5000) {
                    paycheck = km * 1.05 * 4 * 0.9;
                } else if (km > 5000 && km <= 10000) {
                    paycheck = km * 1.25 * 4 * 0.9;
                } else {
                    paycheck = km * 1.45 * 4 * 0.9;
                }
                break;
            default:

                break;

        }
        System.out.printf("%.2f", paycheck);
    }
}
