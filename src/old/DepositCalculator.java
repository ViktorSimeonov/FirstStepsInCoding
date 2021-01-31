package old;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double DepSum = Double.parseDouble(scanner.nextLine());
        int Months = Integer.parseInt(scanner.nextLine());
        Double Percent = Double.parseDouble(scanner.nextLine());
        Double Interest = (DepSum * Percent)/100;
        Double InterestMont = Interest/12;
        Double Sum = DepSum +(Months*InterestMont);
        System.out.println(Sum);


    }
}
