package old;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Metri = Double.parseDouble(scanner.nextLine());
        Double Price = Metri * 7.61;
        Double Discount = 0.18 * Price;
        Double FinalPrice = Price - Discount;
        System.out.printf("The final price is:%f lv.%n" ,FinalPrice);
        System.out.printf("The discount is:%f lv",Discount);

    }
}
