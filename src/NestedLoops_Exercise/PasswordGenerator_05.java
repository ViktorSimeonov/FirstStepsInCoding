package NestedLoops_Exercise;


import java.util.Scanner;

public class PasswordGenerator_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        for (int firstSymbol = 1; firstSymbol <= n; firstSymbol++) {
            for (int secondSymbol = 1; secondSymbol <= n; secondSymbol++) {
                for (int i = 97; i < (97 + l); i++) {
                    String thirdSymbol = Character.toString((char) i);
                    for (int j = 97; j < (97 + l); j++) {
                        String fourthSymbol = Character.toString((char) j);
//                        for (int k =(firstSymbol+ secondSymbol); k <= n; k++)
                        for (int fifth = 1; fifth <= n; fifth++) {
                            if (fifth > firstSymbol && fifth > secondSymbol) {
                                System.out.printf("%d%d%s%s%d ", firstSymbol, secondSymbol, thirdSymbol, fourthSymbol, fifth);
                            }
                        }
                    }
                }
            }


        }
    }
}


