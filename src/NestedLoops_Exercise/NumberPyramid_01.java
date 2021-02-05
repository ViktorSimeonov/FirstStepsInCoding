package NestedLoops_Exercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int current =0;
        boolean isBigger = false;

        for (int row =1 ; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
               // System.out.printf("ред %d%n",row);
               // System.out.printf("колона %d%n",cols)
                current++;
                if ( current > n){
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");

            }if (isBigger){
                break;
            }
            System.out.println();

        }

    }
}

