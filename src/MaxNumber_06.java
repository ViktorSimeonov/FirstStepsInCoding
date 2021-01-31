import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        String input = scanner.nextLine(); // Stop || 100
        while (!input.equals("Stop")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }

}
