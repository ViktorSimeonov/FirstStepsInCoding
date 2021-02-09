package Exam_16062019;

import java.util.Scanner;

public class MovieTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int firstRange = n-1;
        int secondRange = ((n/2)-1);
        for (int i = (a1); i <= (a2 - 1); i++) {
            char firstSymbol = (char) i;
            for (int j = 1; j <= firstRange; j++) {
                for (int k = 1; k <= secondRange; k++) {
                    if (i % 2 != 0 && (i + j + k) % 2 != 0) {


                        System.out.printf("%c-%d%d%d%n", firstSymbol, j, k, i);
                    }
                }

            }

        }
    }
}
