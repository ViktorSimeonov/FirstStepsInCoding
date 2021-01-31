package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test = day of the week
        int number = Integer.parseInt(scanner.nextLine());
        //String text = scanner.nextLine();
        // switch сравеняваме само равенство !!!
        // можем да сравняваме текст, число или буква ( char )
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("Working day!");
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }

    }
}
