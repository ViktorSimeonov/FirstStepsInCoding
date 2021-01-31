package ForLoop_Lab;

import java.util.Scanner;

public class LeftAndRightSum_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for ( int i = 1; i <= n;i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            leftSum+=currentNumber;
        }
        for ( int i = 1; i <= n;i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            rightSum+=currentNumber;
        }
        if ( leftSum == rightSum){
            System.out.println("Yes, sum = " +leftSum);
        } else {
            System.out.printf("No, diff = %d",+Math.abs(rightSum-leftSum));


        }
    }
}
