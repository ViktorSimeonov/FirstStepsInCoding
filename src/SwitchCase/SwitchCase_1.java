package SwitchCase;

import java.util.Scanner;

public class SwitchCase_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test = day of the week
        int number = Integer.parseInt(scanner.nextLine());
        //String text = scanner.nextLine();
        // switch сравеняваме само равенство !!!
        // можем да сравняваме текст, число или буква ( char )
        switch (number) {
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Tursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            default:
                System.out.println("Wrong input!");
        }

    }
}
