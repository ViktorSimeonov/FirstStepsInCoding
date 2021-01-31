package SimpleConditions_ExamProblems_3_2;
//Задача 4. Храна за домашни любимци
//        Изпит по "Основи на програмирането" – 28 и 29 март 2020
import java.util.Scanner;

public class Harvest_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vineyard = Integer.parseInt(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        double wine = Integer.parseInt(scanner.nextLine());
        double workers = Integer.parseInt(scanner.nextLine());
        double wineProduced = ((vineyard * 0.4) * grapes) / 2.5;
        if (wineProduced < wine) {
            double lessWine = Math.floor(wine - wineProduced);

            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", lessWine);

        } else {
            double moreWine = Math.ceil(wineProduced - wine);
            double forWorker = Math.ceil((wineProduced - wine) / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineProduced));
            System.out.printf("%.0f liters left -> %.0f liters per person.", moreWine, forWorker);

        }
    }
}
