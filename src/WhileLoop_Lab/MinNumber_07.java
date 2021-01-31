package WhileLoop_Lab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentNumber = scanner.nextLine();
        double stringToNum;
        double minNumber = Double.MAX_VALUE;
        while(!currentNumber.equals("Stop")){
             stringToNum= Double.parseDouble(currentNumber);
            if (minNumber > stringToNum){
                 minNumber =stringToNum;
            }
            currentNumber = scanner.nextLine();
        }
        System.out.printf("%.0f",minNumber);
    }
}
