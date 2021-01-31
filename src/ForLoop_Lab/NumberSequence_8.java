package ForLoop_Lab;

import java.util.Scanner;

public class NumberSequence_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
