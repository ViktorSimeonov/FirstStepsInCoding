package ForLoop_MoreExercises;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int yearTo = Integer.parseInt(scanner.nextLine());
        int yearsIvan = 17;
        double moneyToLive = 0;
        for (int i = 1800; i <= yearTo; i++){
            yearsIvan++;
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= 12000 + (50 * yearsIvan);
            }
        }if ( money >= 0){

            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        }else {

            System.out.printf("He will need %.2f dollars to survive.",Math.abs(money));
        }
    }
}
