package ForLoop_MoreExercises;

import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double sum ;
        double firstSum = 0;
        double midSum = 0;
        double diff1=0 ;
//        double minDiff = Double.MIN_VALUE;
        boolean equal = true;
        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sum = num1 + num2;
            if (i % 2 != 0) {
                firstSum = sum;
            } else {
                midSum = sum;
            }
            if (firstSum == midSum || n <2) {
                equal = true;
            } else {
                diff1 = Math.abs(midSum - firstSum);
                equal = false;
//                if ( diff1 > minDiff ){
//                    minDiff = diff1;
//                }
            }
        }
        if (equal){
            System.out.printf("Yes, value=%.0f",firstSum);
        }else {
            System.out.printf("No, maxdiff=%.0f",diff1);
        }
    }
}
