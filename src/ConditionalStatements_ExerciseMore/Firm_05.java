package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededHours = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double hoursWorking =Math.floor((days*0.9)*8+(2*days*workers));
        if (hoursWorking >= neededHours){
            System.out.printf("Yes!%.0f hours left.",Math.floor(hoursWorking-neededHours));
        }else {
            System.out.printf("Not enough time!%.0f hours needed.",Math.floor(neededHours-hoursWorking));
        }
    }
}
