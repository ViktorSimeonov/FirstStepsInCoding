package ConditionalStatementsNested_MoreExercises;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double juniorsCycling = Double.parseDouble(scanner.nextLine());
        double seniorsCycling = Double.parseDouble(scanner.nextLine());
        String raceType = scanner.nextLine();
        double gift =0;
        switch (raceType) {
            case "trail":
                juniorsCycling *= 5.50;
                seniorsCycling *= 7;

                break;
            case "cross-country":
                if ((juniorsCycling+seniorsCycling)>=50){
                    juniorsCycling *= 8*0.75;
                    seniorsCycling *= 9.50*0.75;
                }else {
                    juniorsCycling *= 8;
                    seniorsCycling *= 9.50;
                }
                break;
            case "downhill":
                juniorsCycling *= 12.25;
                seniorsCycling *= 13.75;
                break;
            case "road":
                juniorsCycling *= 20;
                seniorsCycling *= 21.5;
                break;
        } gift =0.95*(juniorsCycling+seniorsCycling);
        System.out.printf("%.2f",gift);
    }
}
