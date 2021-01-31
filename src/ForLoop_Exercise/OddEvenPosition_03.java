package ForLoop_Exercise;

import java.util.Scanner;

public class OddEvenPosition_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double sumOdd = 0;
        double sumEven = 0;
        double minOdd = Integer.MAX_VALUE;
        double minEven = Integer.MAX_VALUE;
        double maxOdd = Integer.MIN_VALUE;
        double maxEven = Integer.MIN_VALUE;
//        double numEven = 0;
//        double numOdd = 0;
        for (int i = 1; i <= N; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += currentNumber;
//                numEven += 1;
                if (currentNumber > maxEven) {
                    maxEven = currentNumber;
                }
                if (currentNumber < minEven) {
                    minEven = currentNumber;
                }
            } else {
                sumOdd += currentNumber;
//                numOdd += 1;
                if (currentNumber > maxOdd) {
                    maxOdd = currentNumber;
                }
                if (currentNumber < minOdd) {
                    minOdd = currentNumber;
                }
            }
        }
        if (sumOdd == 0) {
            System.out.printf("OddSum=%.2f,%n", sumOdd);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        }
//        else if (numOdd == 1) {
//            System.out.printf("OddSum=%.2f,%n", sumOdd);
//            System.out.printf("OddMin=%.2f,%n", minOdd);
//            System.out.printf("OddMax=%.2f,%n", maxOdd);
//        }
        else {
            System.out.printf("OddSum=%.2f,%n", sumOdd);
            System.out.printf("OddMin=%.2f,%n", minOdd);
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }
        if (sumEven == 0) {
            System.out.printf("EvenSum=%.2f,%n", sumEven);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
//        else if (numEven == 1) {
//            System.out.printf("EvenSum=%.2f,%n", sumEven);
//            System.out.printf("EvenMin=%.2f,%n", minEven);
//            System.out.printf("EvenMax=%.2f%n", maxEven);
//        }
        else {
            System.out.printf("EvenSum=%.2f,%n", sumEven);
            System.out.printf("EvenMin=%.2f,%n", minEven);
            System.out.printf("EvenMax=%.2f%n", maxEven);
        }

    }

}

