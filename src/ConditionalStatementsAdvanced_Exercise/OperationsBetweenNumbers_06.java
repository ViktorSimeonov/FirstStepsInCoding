package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        double result ;
        String evenOdd ;
        if (operation.equals("+")) {
            result = N1 + N2;
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", N1, operation, N2, result, evenOdd);
        } else if (operation.equals("-")) {
            result = N1 - N2;
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", N1, operation, N2, result, evenOdd);
        } else if (operation.equals("*")) {
            result = N1 * N2;
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", N1, operation, N2, result, evenOdd);
        } else if (operation.equals("/")) {
            if ( N2 == 0){
                System.out.printf("Cannot divide %d by zero",N1);
            }else {
                result = N1 / (N2*1.000);
                System.out.printf("%d / %d = %.2f",N1,N2,result);
            }
        } else if (operation.equals("%")) {
            if ( N2 == 0){
                System.out.printf("Cannot divide %d by zero",N1);
            }else {
                result = N1 % N2;
                System.out.printf("%d %s %d = %.0f",N1,operation,N2,result);
            }
        }
    }
}
