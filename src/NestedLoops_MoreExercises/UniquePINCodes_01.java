package NestedLoops_MoreExercises;

import java.util.Scanner;

public class UniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int count;
        String outputFirst = "";
        String outputSecond = "";
        String outputThird = "";
        for (int firstNum = 1; firstNum <= first; firstNum++) {
            if (firstNum % 2 != 0) {
                outputFirst = "";
                continue;
            }
//            outputFirst += firstNum;
//            System.out.println(outputFirst);// Принт първо число
            for (int secondNum = 1; secondNum <= second; secondNum++) {
                count = 0;
                outputSecond = "";
                for (int i = 1; i <= secondNum; i++) {
                    if (secondNum % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
//                    outputSecond += secondNum;

                } else {
                    continue;
                }
                for (int thirdNum = 1; thirdNum <= third; thirdNum++) {
                    if (thirdNum % 2 != 0) {
                        outputThird = "";
                        continue;
                    }
//                    outputThird += thirdNum;
//                    System.out.printf("%s %s %s %n", outputFirst, outputSecond, outputThird);
                    System.out.printf("%d %d %d%n",firstNum, secondNum,thirdNum);
                }
            }
        }
    }
}



