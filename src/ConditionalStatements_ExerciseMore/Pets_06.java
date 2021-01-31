package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());
        double neededFood = days*dogFood+days*catFood+((days*turtleFood)/1000);
        if (leftFood >= neededFood ){
            double moreFood = Math.floor((leftFood-neededFood));
            System.out.printf("%.0f kilos of food left.",moreFood);
        }else {
            double notEnoughFood = Math.ceil(neededFood-leftFood);
            System.out.printf("%.0f more kilos of food are needed.",notEnoughFood);
        }
    }
}
