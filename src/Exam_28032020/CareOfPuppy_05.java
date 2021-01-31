package Exam_28032020;

import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int food = Integer.parseInt(scanner.nextLine());
        food *=1000;
        String foodEaten = scanner.nextLine();
        int foodInGram = 0;
        while (!foodEaten.equals("Adopted")){
            foodInGram = Integer.parseInt(foodEaten);
            food -=foodInGram;
            foodEaten = scanner.nextLine();
        }if ( food >= 0){
            System.out.printf("Food is enough! Leftovers: %d grams.",food);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(food) );
        }
    }
}
