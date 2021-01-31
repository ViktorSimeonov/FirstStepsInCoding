package Exam_28032020;

import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wordRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecPerMeter = Double.parseDouble(scanner.nextLine());
        double time = distanceInMeters*timeInSecPerMeter;
        double slow = Math.floor(distanceInMeters/50)*30;
        double timeGeorgi = time + slow;
        if (timeGeorgi >= wordRecord){
            System.out.printf("No! He was %.2f seconds slower.",(timeGeorgi - wordRecord));
        }else {
            System.out.printf("Yes! The new record is %.2f seconds.",timeGeorgi);
        }

    }
}
