package WhileLoopMoreExercises;

import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double count=0;
        while (n>0){
            sum += Double.parseDouble(scanner.nextLine());
            count++;
            n--;
        }
        System.out.printf("%.2f",(sum/count));
    }
}
