package Exam_16062019;

import java.util.Scanner;

public class MovieDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeForMovie = Integer.parseInt(scanner.nextLine());
        int scene = Integer.parseInt(scanner.nextLine());
        int timeScene = Integer.parseInt(scanner.nextLine());
        double prepareForMovie = timeForMovie*0.15;
        double time = prepareForMovie+(scene*timeScene);
        if ( timeForMovie >= time){
            double moreTime = Math.round(timeForMovie-time);
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",moreTime);
        }else {
            double notEnoughTime = Math.round(time - timeForMovie);
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",notEnoughTime);
        }
    }
}
