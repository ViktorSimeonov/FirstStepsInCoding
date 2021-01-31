package Exam_28032020;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minWalk = Integer.parseInt(scanner.nextLine());
        int numWalk = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());
        int time = numWalk*minWalk;
        int calories = time*5;
        double percent50ofCalories = caloriesPerDay / (2*1.00);

        if ( calories >= percent50ofCalories){
            System.out.printf("Yes, the walk for your cat is enough." +
                    " Burned calories per day: %d.",calories );
        }else {
            System.out.printf("No, the walk for your cat is not enough. " +
                    "Burned calories per day: %d.",calories);
        }
    }
}
