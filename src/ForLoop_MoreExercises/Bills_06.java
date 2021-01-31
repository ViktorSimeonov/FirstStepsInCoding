package ForLoop_MoreExercises;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double water = 0;
        double internet = 0;

        double electricity =0 ;
        for (int i = 1; i <= months; i++) {
            electricity += Double.parseDouble(scanner.nextLine());
            water += 20;
            internet += 15;
        }
       double other = (electricity+water+internet)*1.2;
           double average = (other+electricity+water+internet)/months;
        System.out.printf("Electricity: %.2f lv%n",electricity);
        System.out.printf("Water: %.2f lv%n",water);
        System.out.printf("Internet: %.2f lv%n",internet);
        System.out.printf("Other: %.2f lv%n",other);
        System.out.printf("Average: %.2f lv%n",average);
    }
}
