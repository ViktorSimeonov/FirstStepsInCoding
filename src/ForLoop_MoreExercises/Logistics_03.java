package ForLoop_MoreExercises;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double busWeight = 0;
        double truckWeight = 0;
        double trainWeight = 0;
        double weightAll = 0;
        for (int i = 1; i <= num; i++) {
            int weight = Integer.parseInt(scanner.nextLine());
            if (weight <= 3) {
                busWeight += weight;
            } else if (weight <= 11) {
                truckWeight += weight;

            } else {
                trainWeight += weight;
            }
            weightAll += weight;
        }
        double busPrice = busWeight * 200;
        double truckPrice = truckWeight * 175;
        double trainPrice = trainWeight * 120;
        double middlePrice = (busPrice + truckPrice + trainPrice)/weightAll;
        System.out.printf("%.2f%n",middlePrice);
        System.out.printf("%.2f%%%n",((busWeight/weightAll)*100));
        System.out.printf("%.2f%%%n",((truckWeight/weightAll)*100));
        System.out.printf("%.2f%%%n",((trainWeight/weightAll)*100));


    }
}
