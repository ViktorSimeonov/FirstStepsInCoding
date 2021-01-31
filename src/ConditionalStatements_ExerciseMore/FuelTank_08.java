package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class FuelTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        if (quantityFuel >= 25) {
            switch (fuel) {
                case "Diesel":
                    System.out.println("You have enough diesel.");
                    break;
                case "Gasoline":
                    System.out.println("You have enough gasoline.");
                    break;
                case "Gas":
                    System.out.println("You have enough gas.");
                    break;
                default:
                    System.out.println("Invalid fuel!");
                    break;
            }
        } else {
            switch (fuel) {
                case "Diesel":
                    System.out.println("Fill your tank with diesel!");
                    break;
                case "Gasoline":
                    System.out.println("Fill your tank with gasoline!");
                    break;
                case "Gas":
                    System.out.println("Fill your tank with gas!");
                    break;
                default:
                    System.out.println("Invalid fuel!");
                    break;
            }

        }
    }
}


