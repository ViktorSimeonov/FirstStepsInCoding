package Exam_16062019;

import java.util.Scanner;

public class Oscars_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int evaluators = Integer.parseInt(scanner.nextLine());
        double allPoints = 0;
        allPoints+=pointsFromAcademy;
        boolean winner = false;
        for (int i = 1; i <= evaluators; i++) {
            String nameOfEvaluator = scanner.nextLine();
            double pointOfEvaluator = Double.parseDouble(scanner.nextLine());
            double pointsFromName=(((nameOfEvaluator.length() * pointOfEvaluator)) / 2);
            allPoints += pointsFromName;
            if (allPoints > 1250.5) {
                winner = true;
                break;
            }

        }
        if (winner) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, allPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, (1250.5 - allPoints));
        }
    }
}
