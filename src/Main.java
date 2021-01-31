import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());

        while (input >= 0) {
            double result = 2;
            result *= input;
            System.out.printf("Result: %.2f%n",result);
            input = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Negative number!");
    }
}
