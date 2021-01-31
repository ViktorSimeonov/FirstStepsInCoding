package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class FlowerShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double gift = Double.parseDouble(scanner.nextLine());
        double sum = (magnolias * 3.25 + roses * 3.50 + hyacinths * 4 + cactus * 8) * 0.95;
        if (sum >= gift) {
        double moreMoney = Math.floor(sum - gift);
            System.out.printf("She is left with %.0f leva.",moreMoney);
        }else {
            double notEnoughMoney = Math.ceil(gift - sum);
            System.out.printf("She will have to borrow %.0f leva.",notEnoughMoney);
        }


    }
}
