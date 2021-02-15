package ExamRetake_03052019;

import java.util.Scanner;

public class _2_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        double sum = (fuel*2.10)+100;
        if (dayOfWeek.equals("Sunday")){
            sum*=0.8;
        }else if (dayOfWeek.equals("Saturday")) {
            sum*=0.9;
        }
        if (budget>= sum){
            System.out.printf("Safari time! Money left: %.2f lv.",(budget-sum));
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",(sum-budget));
        }

    }
}
