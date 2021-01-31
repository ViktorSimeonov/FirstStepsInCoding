package SwitchCase;

import java.util.Scanner;

public class SwitchCase_test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test = day of the week
        String text = scanner.nextLine();
        // switch сравеняваме само равенство !!!
        // можем да сравняваме текст, число или буква ( char )
        switch (text){
            case "Monday":
                System.out.println("Monday!");
                break;
            case "Tuesday":
                System.out.println("Tuesday!");
                break;
            case "Wednesday":
                System.out.println("Wednesday!");
                break;
        }

    }

}
