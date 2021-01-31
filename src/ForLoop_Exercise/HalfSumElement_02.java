package ForLoop_Exercise;
//Елемент, равен на сумата на останалите
import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxNumber) {
                maxNumber  = number;

            }
            sum += number;
        }
        sum -= maxNumber;
        if (sum == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum - maxNumber));
        }

    }
}
