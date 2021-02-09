import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedSum = Integer.parseInt(scanner.nextLine());
        int transaction = 0;
        int totalSum = 0;
        String command = scanner.nextLine();
        double cash = 0;
        double card = 0;
        int cashTimes = 0;
        int cardTimes = 0;
        double averageCash = 0;
        double averageCard = 0;
        while(!command.equals("End")) {
            int currentSum = Integer.parseInt(command);
            transaction++;

            if(transaction % 2 == 0) {
                cardTimes++;
                card += currentSum;
                if(currentSum > 10) {
                    System.out.println("Product sold!");

                } else if (currentSum < 10) {
                    System.out.println("Error in transaction!");
                    card -= currentSum;
                    cardTimes--;
                    totalSum -= currentSum;
                }
            }
            else if(transaction % 2 == 1) {
                cashTimes++;
                cash += currentSum;
                if(currentSum < 100) {
                    System.out.println("Product sold!");
                } else if(currentSum > 100) {
                    System.out.println("Error in transaction!");
                    cash -= currentSum;
                    cashTimes--;
                    totalSum -= currentSum;
                }
            }
            totalSum += currentSum;

            if(totalSum >= expectedSum) {
                averageCash = cash / cashTimes;
                System.out.printf("%nAverage CS: %.2f%n", averageCash);
                averageCard = card / cardTimes;
                System.out.printf("Average CC: %.2f", averageCard);
                break;

            }
            command = scanner.nextLine();

        } if(totalSum < expectedSum) {
            System.out.println("Failed to collect required money for charity.");
        }


    }


}
