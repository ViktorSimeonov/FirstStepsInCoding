package Exam_28032020;

import java.util.Scanner;

public class Change_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBitcoin = Integer.parseInt(scanner.nextLine());
        double numChinaJuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double dolar = 1.76;
        double euro = 1.95;
        double bitcoin = 1168;
        double chinaJuan = 0.15*dolar;
        double allEuro = ((numBitcoin*bitcoin + numChinaJuan*chinaJuan)/euro);
        double allEuroCom = allEuro - allEuro*(commission/(100*1.00));
        System.out.printf("%.2f",allEuroCom);
    }
}
