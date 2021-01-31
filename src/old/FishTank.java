package old;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int Volume = a * b * h;
        double Liters = Volume * 0.001;
        percent = percent * 0.01;
        Liters = Liters * ( 1- percent);
        System.out.printf("%.2f",Liters);



    }
}
