package SimpleConditions_ExamProblems_3_2;

import java.util.Scanner;

public class SleepyTomCat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());
        int timePlay = (restDays * 127) + ((365 - restDays) * 63);
        if ( timePlay >= 30000){
            System.out.println("Tom will run away");
            int hour = (timePlay - 30000) / 60;
            int min = (timePlay - 30000) % 60;
            System.out.printf("%d hours and %d minutes more for play",hour,min);
        } else {
            System.out.println("Tom sleeps well");
            int hour = (30000 - timePlay) / 60;
            int min = (30000 - timePlay) % 60;
            System.out.printf("%d hours and %d minutes less for play",hour,min);
        }
    }
}
