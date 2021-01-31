package old;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DogsNumber = Integer.parseInt(scanner.nextLine());
        int Animals = Integer.parseInt(scanner.nextLine());
        Double sum = ( 2.50 * DogsNumber ) + ( 4 * Animals );
        System.out.printf ( " %f lv.", sum);


    }
}
