package Exam_21032019;

import java.util.Scanner;

public class EasterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceBrashno = Double.parseDouble(scanner.nextLine());
        double kilogramiBrashno = Double.parseDouble(scanner.nextLine());
        double kilogramiZahar = Double.parseDouble(scanner.nextLine());
        double koriQica = Double.parseDouble(scanner.nextLine());
        double maq = Double.parseDouble(scanner.nextLine());
        double price = (priceBrashno*kilogramiBrashno)+(kilogramiZahar*(priceBrashno*0.75))+(koriQica*(priceBrashno*1.1))+(maq*(0.2*(priceBrashno*0.75)));
        System.out.printf("%.2f",price);
    }
}
