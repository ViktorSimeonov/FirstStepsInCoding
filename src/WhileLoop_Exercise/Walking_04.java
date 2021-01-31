package WhileLoop_Exercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps = scanner.nextLine();
        int sumSteps = 0;

        while (!steps.equals("Going home")) {
            sumSteps += Integer.parseInt(steps);
            if (sumSteps >= 10000) {
//                  System.out.println("Goal reached! Good job!");
//                 System.out.printf("%d steps over the goal!",((sumSteps-10000)));
                break;
            }
            steps = scanner.nextLine();
//            if (steps.isBlank()){
//                System.out.println("not enough steps");
//                break;
//            }
        }
        if (sumSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", (sumSteps - 10000));
        } else {
            steps = scanner.nextLine();
            sumSteps += Integer.parseInt(steps);
            if (sumSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", (sumSteps - 10000));
            }else {
                System.out.printf("%d more steps to reach goal.", (10000 - sumSteps));
            }
        }
    }
}
