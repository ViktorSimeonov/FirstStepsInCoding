package NestedLoops_MoreExercises;

import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int countPassword = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean end = false;
        int firstSymbol = 35;
        int secondSymbol = 64;
        while (countPassword > count) {
            if (end){
                break;
            }
            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    char A = (char) firstSymbol;
                    char B = (char) secondSymbol;
                    System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                    count++;
                    firstSymbol++;
                    secondSymbol++;
                    if(firstSymbol==56){
                        firstSymbol=35;
                    }
                    if(secondSymbol==97){
                        secondSymbol=64;
                    }
                    if (count == countPassword) {
                        end = true;
                        break;
                    }
                }
                if(end){
                    break;
                }
                if (x==a){
                    end = true;
                    break;
                }
            }

        }
    }
}



