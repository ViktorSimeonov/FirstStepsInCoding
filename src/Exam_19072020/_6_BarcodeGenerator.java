package Exam_19072020;

import java.util.Scanner;

public class _6_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int unitsStart = startNum % 10;
        int tensStart = (startNum / 10) % 10;
        int hundredsStart = (startNum / 100) % 10;
        int thousandStart = (startNum / 1000) % 10;
        int unitsEnd = endNum % 10;
        int tensEnd = (endNum / 10) % 10;
        int hundredsEnd = (endNum / 100) % 10;
        int thousandEnd = (endNum / 1000) % 10;
        int count=0;
        for (int l = thousandStart; l <= thousandEnd; l++) {
            for (int k = hundredsStart; k <= hundredsEnd; k++) {
                for (int j = tensStart; j <= tensEnd; j++) {
                    for (int i = unitsStart; i <= unitsEnd; i++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", l,k,j,i);

                        }
                    }
                }

            }
        }

    }
}


