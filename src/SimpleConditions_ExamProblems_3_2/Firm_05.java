package SimpleConditions_ExamProblems_3_2;

import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int persons = Integer.parseInt(scanner.nextLine());
        double workHours = (days*0.9)*10*persons;
        if (workHours >=hours){
            System.out.printf("Yes!%.0f hours left.",Math.floor(workHours-hours));

        }else {
            System.out.printf("Not enough time!%.0f hours needed.",Math.floor(hours-workHours));
        }
    }
}
