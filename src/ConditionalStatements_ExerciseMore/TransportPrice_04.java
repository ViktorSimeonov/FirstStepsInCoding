package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String when = scanner.nextLine();
        double price;
        if (when.equals("day")) {
            if (km < 20) {
price = 0.7 +(0.79*km);
            }else if ( km < 100){
             price = km*0.09;
            }else {
                price = km*0.06;
            }
        } else {
            if (km < 20) {
                price = 0.7 +(0.90*km);
            }else if ( km < 100){
                price = km*0.09;
            }else {
                price = km*0.06;
            }
        }
        System.out.printf("%.2f",price);
    }
}
