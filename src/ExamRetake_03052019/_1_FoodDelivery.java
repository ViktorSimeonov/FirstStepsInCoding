package ExamRetake_03052019;

import java.util.Scanner;

public class _1_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double sum = ((chicken * 10.35 + fish * 12.40 + vegetarian * 8.15)*1.2)+2.5;
        System.out.printf("Total: %.2f",sum);
    }
}
