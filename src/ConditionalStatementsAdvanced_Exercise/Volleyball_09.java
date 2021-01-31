package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Volleyball_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int pPraznici = Integer.parseInt(scanner.nextLine());
        int hSelo = Integer.parseInt(scanner.nextLine());
        int weekend = 48 ;
        double weekendInSofia = weekend - hSelo;
        double notToWork = weekendInSofia * 0.75;
        double countGameYearly = notToWork +(pPraznici*(2/(3*1.00)))+hSelo;
        if (year.equals("normal")) {
            System.out.printf("%.0f",Math.floor(countGameYearly));
        }else if (year.equals("leap")){
            countGameYearly *=1.15;
            System.out.printf("%.0f",Math.floor(countGameYearly));
        }
    }
}
