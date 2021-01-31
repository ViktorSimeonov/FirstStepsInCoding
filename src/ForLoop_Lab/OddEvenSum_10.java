package ForLoop_Lab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumOdd += currentNumber;
            } else {
                sumEven += currentNumber;
            }
        }
        if (sumOdd == sumEven) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumEven - sumOdd));
        }
    }

}
