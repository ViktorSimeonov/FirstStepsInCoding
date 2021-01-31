package Exam_21032019;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kozunaci = Double.parseDouble(scanner.nextLine());
        double koriSQica = Double.parseDouble(scanner.nextLine());
        double kurabii = Double.parseDouble(scanner.nextLine());
        double price = (kozunaci*3.20)+(kurabii*5.40)+(koriSQica*4.35)+(koriSQica*12*0.15);
        System.out.printf("%.2f",price);
    }
}
