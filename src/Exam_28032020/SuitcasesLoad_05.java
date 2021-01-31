package Exam_28032020;

import java.util.Scanner;

public class SuitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String volume = scanner.nextLine();

        double counter = 0;
        while (!volume.equals("End")) {
            double cofferVolume = Double.parseDouble(volume);
            if ((counter + 1) % 3 == 0) {
                cofferVolume += 1.1;
            }
            if (cofferVolume >= capacity) {
                break;
            }
            capacity -= cofferVolume;
            volume = scanner.nextLine();
            counter++;
        }
        if ("End".equals(volume)) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %.0f suitcases loaded.", counter);
    }
}
