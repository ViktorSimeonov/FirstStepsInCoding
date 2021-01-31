package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notWorkingDay = Integer.parseInt(scanner.nextLine());
        int playTime = ((365 - notWorkingDay)*63) + notWorkingDay*127;

        if ( playTime > 30000){
            System.out.println("Tom will run away");
            int H = ( playTime - 30000) / 60;
            int min = ( playTime - 30000) % 60;
            System.out.printf("%d hours and %d minutes more for play",H,min);
        }else {
            System.out.println("Tom sleeps well");
            int H = ( 30000 - playTime ) / 60;
            int min = ( 30000 - playTime) % 60;
            System.out.printf("%d hours and %d minutes less for play",H,min);
        }


    }
}
