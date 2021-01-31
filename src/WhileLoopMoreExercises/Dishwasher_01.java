package WhileLoopMoreExercises;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottleDetergent = Integer.parseInt(scanner.nextLine());
        int liquidDetergent = bottleDetergent * 750;
        String command = scanner.nextLine();
        int dishes;
        int num = 0;
        int pot = 0;
        int teller = 0;
        while (!command.equals("End")) {
            num++;
            dishes = Integer.parseInt(command);
            if (num % 3 == 0) {
                liquidDetergent -= (dishes * 15);
                pot += dishes;
            } else {
                liquidDetergent -= (dishes * 5);
                teller += dishes;
            }
            if (liquidDetergent < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(liquidDetergent));
                break;
            }
            command = scanner.nextLine();


        }
        if (command.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", teller, pot);
            System.out.printf("Leftover detergent %d ml.", liquidDetergent);
        }
    }
}
