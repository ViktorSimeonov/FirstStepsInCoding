package old;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Rad = Double.parseDouble(scanner.nextLine());
        Double Deg = (Rad * 180)/ Math.PI;
        System.out.printf("%.0f",Deg);

    }
}
