package SimpleConditions_ExamProblems_3_2;

import java.util.Scanner;

public class TransportPrice_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String doyOrNight = scanner.nextLine();
        double cheapestPrise ;
        switch (doyOrNight) {
            case "day":
                if (kilometers < 20) {
                    cheapestPrise = (0.79 * kilometers)+0.70;

                } else if ( kilometers < 100) {
                    cheapestPrise = 0.09 * kilometers;
                } else  {
                    cheapestPrise = 0.06 * kilometers;
                }
                System.out.println(cheapestPrise);

                break;

            case "night":
                if (kilometers < 20) {
                    cheapestPrise = (0.90 * kilometers)+0.70;

                } else if ( kilometers < 100) {
                    cheapestPrise = 0.09 * kilometers;
                } else  {
                    cheapestPrise = 0.06 * kilometers;
                }
                System.out.println(cheapestPrise);
                break;
        }
    }
}

