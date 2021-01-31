package ForLoop_MoreExercises;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacityStadium = Integer.parseInt(scanner.nextLine());
        double fans = scanner.nextDouble();
        double aFans = 0;
        double bFans = 0;
        double vFans = 0;
        double gFans = 0;
        for (int i = 0; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    aFans++;
                    break;
                case "B":
                    bFans++;
                    break;
                case "V":
                    vFans++;
                    break;
                case "G":
                    gFans++;
                    break;
            }
        }
        System.out.printf("%.2f%%%n",((aFans/fans)*100));
        System.out.printf("%.2f%%%n",((bFans/fans)*100));
        System.out.printf("%.2f%%%n",((vFans/fans)*100));
        System.out.printf("%.2f%%%n",((gFans/fans)*100));
        System.out.printf("%.2f%%%n",((fans/capacityStadium)*100));
    }
}
