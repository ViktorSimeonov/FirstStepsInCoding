package old;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Dolars = Double.parseDouble(scanner.nextLine());
        Double BGN = Dolars * 1.79549;
        System.out.println(BGN);

    }
}
