package NestedLoops_MoreExercises;

import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char beginInterval = scanner.next().charAt(0);
        char endInterval = scanner.next().charAt(0);
        char missLetter = scanner.next().charAt(0);
        int counter =0;
        for (int i = beginInterval; i <= endInterval; i++) {
            if ( i==missLetter){
                continue;
            }
            for (int j = beginInterval; j <= endInterval; j++) {
                if ( j==missLetter){
                    continue;
                }
                for (int k = beginInterval; k <= endInterval; k++) {
                    if ( k==missLetter){
                        continue;
                    }
                    counter++;
                    System.out.print((char) i);
                    System.out.print((char) j);
                    System.out.print((char) k);
                    System.out.print(" ");
                   if(i==endInterval&&j==endInterval&&k==endInterval){
                       System.out.print(counter);
                   }
                }
            }
        }
    }
}