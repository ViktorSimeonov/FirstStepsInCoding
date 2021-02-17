package Exam_10032019;

import java.util.Scanner;

public class _5_FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int person = Integer.parseInt(scanner.nextLine());
        String action;
        int nBack = 0;
        int nChest = 0;
        int nLegs = 0;
        int nAbs = 0;
        int nShake = 0;
        int nBar = 0;
        int sport = 0;
        int protein = 0;
        for (int i = 1; i <= person; i++) {
            action = scanner.nextLine();
            switch (action) {
                case "Back":
                    nBack++;
                    sport++;
                    break;
                case "Chest":
                    nChest++;
                    sport++;
                    break;
                case "Legs":
                    nLegs++;
                    sport++;
                    break;
                case "Abs":
                    nAbs++;
                    sport++;
                    break;
                case "Protein shake":
                    protein++;
                    nShake++;
                    break;
                case "Protein bar":
                    protein++;
                    nBar++;
                    break;
            }

        }
        System.out.printf("%d - back%n",nBack);
        System.out.printf("%d - chest%n",nChest);
        System.out.printf("%d - legs%n",nLegs);
        System.out.printf("%d - abs%n",nAbs);
        System.out.printf("%d - protein shake%n",nShake);
        System.out.printf("%d - protein bar%n",nBar);
        System.out.printf("%.2f%% - work out%n",(sport*1.0/person)*100);
        System.out.printf("%.2f%% - protein%n",(protein*1.0/person)*100);
    }
}
