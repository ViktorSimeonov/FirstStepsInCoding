package NestedLoops_MoreExercises;

import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneCoins = Integer.parseInt(scanner.nextLine());
        int twoCoins = Integer.parseInt(scanner.nextLine());
        int fiveCoins = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        int result ;
        int count=0;
        for (int i = 0; i <= oneCoins; i++) {
            for (int j = 0; j <= twoCoins; j++) {
                for (int k = 0; k <= fiveCoins; k++) {
                    result = sum - (k*5) - (j * 2) - i ;
                    if( result==0){
                        count++;
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,sum);

                    }

                }

            }

        }

    }

}

