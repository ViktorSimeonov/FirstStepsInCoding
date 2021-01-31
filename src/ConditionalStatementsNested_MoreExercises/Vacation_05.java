package ConditionalStatementsNested_MoreExercises;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String placesForSleep = "";
        double price = 0;
        if ( budget <= 1000){
            placesForSleep = "Camp";
            if ( season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.65;
            }else {
                location = "Morocco";
                price = budget * 0.45;
            }
        }else if ( budget >1000 && budget <= 3000){
            placesForSleep = "Hut";
            if ( season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.80;
            }else {
                location = "Morocco";
                price = budget * 0.60;
            }
        }else {
            placesForSleep = "Hotel";
            if ( season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.90;
            }else {
                location = "Morocco";
                price = budget * 0.90;
            }

        }
        System.out.printf("%s - %s - %.2f",location,placesForSleep,price);

    }
}
