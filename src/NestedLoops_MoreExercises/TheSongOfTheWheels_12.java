package NestedLoops_MoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String pass = "";
        boolean isFour = false;
        boolean notFound = false;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (M == ((a * b) + (c * d))) {
                            if (a < b && c > d) {
                                count++;
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                if (count == 4) {
//                                    pass += a;
//                                    pass += b;
//                                    pass += c;
//                                    pass += d;
                                    pass = pass + a + b + c + d;
                                    isFour = true;
                                }
                                if(count==0){
                                   notFound = true;
                                }

                            }
                        }
                    }
                }
            }
        }
        if (isFour) {
            System.out.println();
            System.out.printf("Password: %s", pass);
        }else {
            System.out.println();
            System.out.println("No!");
        }
        if(notFound){
            System.out.println("No!");
        }
    }
}




