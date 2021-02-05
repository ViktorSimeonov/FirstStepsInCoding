package NestedLoops_Exercise;

import java.util.Scanner;

public class SpecialNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        // спецеиално число да се дели без остатък при деленее на N
        // с всяка негова цифра Пример: N=16, 2418
//        for (int i = 1111; i <= 9999; i++) {
//            int units = i % 10;
//            int tens = i / 10 % 10;
//            int hundreds = i / 100 % 10;
//            int thousands = i / 1000;
//            boolean checkUnits = units != 0 && N % units == 0;
//            boolean checkTens = tens != 0 && N % tens == 0;
//            boolean checkHundreds = hundreds != 0 && N % hundreds == 0;
//            boolean checkThousands = N % thousands == 0;
//            if (checkUnits && checkTens && checkHundreds && checkThousands) {
//                System.out.printf("%d ", i);
//            }
//        } друго решение с 4 цикъла
        for (int first = 1; first < 9; first++) {
            for (int second = 1; second < 9; second++) {
                for (int third = 1; third < 9; third++) {
                    for (int forth = 1; forth < 9; forth++) {
                        if (N % first == 0 && N % second == 0 && N % third == 0 && N % forth == 0)
                            System.out.printf("%d%d%d%d ",first,second,third,forth);
                    }
                }
            }
        }
    }
}

