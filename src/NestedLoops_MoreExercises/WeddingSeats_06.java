package NestedLoops_MoreExercises;

import java.util.Scanner;


public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        char lastSector = test.charAt(0);
        int row = Integer.parseInt(scanner.nextLine());
        int oddSits = Integer.parseInt(scanner.nextLine());
        int allSits = 0;
        for (int i = 65; i <= lastSector; i++) {
            // System.out.println((char) i);
            for (int j = 1; j <=row; j++) {
//                System.out.printf("%c%d%n",((char) i),j);
                if (j%2!=0){
                    for (int k = 97; k <(97+oddSits); k++) {
                        allSits++;
                        System.out.printf("%c%d%c%n",((char) i),j,(char) k);
                    }
                }
                else {
                    for (int k = 97; k <(97+oddSits+2); k++) {
                        System.out.printf("%c%d%c%n",((char) i),j,(char) k);
                        allSits++;
                    }
                }
            }row++;
        }
        System.out.println(allSits);
    }
}
