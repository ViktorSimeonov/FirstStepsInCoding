package NestedLoops_Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJury = Integer.parseInt(scanner.nextLine());
        String command;
        double sum;
        double sumAll = 0;
        int count=0;
        while (!"Finish".equals(command = (scanner.nextLine()))) {
            sum = 0;
            for (int juri = 1; juri <= countJury; juri++) {
                sum+=Double.parseDouble(scanner.nextLine());
                count++;
            }
            System.out.printf("%s - %.2f.%n", command, (sum / countJury));
            sumAll += sum;
        }
        System.out.printf("Student's final assessment is %.2f.%n",(sumAll/count));
    }
}
