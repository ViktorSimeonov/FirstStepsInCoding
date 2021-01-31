package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFisherMan = Integer.parseInt(scanner.nextLine());
        double rentBoat = 0;
        switch (season) {
            case "Spring":
                rentBoat = 3000;
                if (numberFisherMan <= 6) {
                    rentBoat *= 0.9;
                } else if (numberFisherMan <= 11) {
                    rentBoat *= 0.85;
                } else {
                    rentBoat *= 0.75;
                }
                if (numberFisherMan % 2 == 0) {
                    rentBoat *= 0.95;
                }
                break;

            case "Summer":
                rentBoat = 4200;
                if (numberFisherMan <= 6) {
                    rentBoat *= 0.9;
                } else if ( numberFisherMan <= 11) {
                    rentBoat *= 0.85;
                } else  {
                    rentBoat *= 0.75;
                }
                if (numberFisherMan % 2 == 0) {
                    rentBoat *= 0.95;
                }
                break;
            case "Autumn":
                rentBoat = 4200;
                if (numberFisherMan <= 6) {
                    rentBoat *= 0.9;
                } else if (numberFisherMan <= 11) {
                    rentBoat *= 0.85;
                } else  {
                    rentBoat *= 0.75;
                }

                break;
            case "Winter":
                rentBoat = 2600;
                if (numberFisherMan <= 6) {
                    rentBoat *= 0.9;
                } else if (numberFisherMan <= 11) {
                    rentBoat *= 0.85;
                } else  {
                    rentBoat *= 0.75;
                }
                if (numberFisherMan % 2 == 0) {
                    rentBoat *= 0.95;
                }
                break;

        }if ( budget >= rentBoat){
            System.out.printf("Yes! You have %.2f leva left.", budget - rentBoat);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", rentBoat-budget);
        }

    }
}
