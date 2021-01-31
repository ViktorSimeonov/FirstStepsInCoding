package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        double Z = Integer.parseInt(scanner.nextLine());
        double workers = Integer.parseInt(scanner.nextLine());
        double forWine = (X * 0.4 * Y) / 2.5;
        if (forWine < Z){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor((Z-forWine)));
        }else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(forWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(forWine-Z),Math.ceil(forWine-Z)/workers);
        }
    }
}
