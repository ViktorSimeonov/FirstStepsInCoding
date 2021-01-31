package WhileLoop_Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalMoney = 0;
        while(!input.equals("NoMoreMoney")){
            double currentAmount = Double.parseDouble(input);
            if ( currentAmount < 0){
                System.out.println("Invalid operation!");
                break;
            }
            totalMoney+=currentAmount;
            System.out.printf("Increase: %.2f%n",currentAmount);
             input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",totalMoney);
    }
}
