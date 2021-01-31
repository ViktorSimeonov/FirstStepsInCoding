package NestedLoops_Lab;

import java.util.Scanner;

public class Combinations_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <=num; j++) {
                for (int k = 0; k <= num; k++) {
//                    System.out.printf("%d %d %d%n",i,j,k);
                    int result = i + j + k;
                    if (result == num ) {
                        count++;
//                        System.out.println(count);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
