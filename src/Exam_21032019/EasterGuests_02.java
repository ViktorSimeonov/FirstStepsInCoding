package Exam_21032019;

import java.util.Scanner;

public class EasterGuests_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double countKozunaci= Math.ceil(numberGuest / 3);
        double price = countKozunaci*4+(numberGuest*2*0.45);
    if ( budget >= price){
        System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n",countKozunaci,(numberGuest*2));
        System.out.printf("He has %.2f lv. left.",(budget-price));
    }else {
        System.out.println("Lyubo doesn't have enough money.");
        System.out.printf("He needs %.2f lv. more.",(price-budget));
    }

    }
}
