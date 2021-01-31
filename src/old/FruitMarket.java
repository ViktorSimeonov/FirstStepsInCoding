package old;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PriceStrawberry = Double.parseDouble(scanner.nextLine());
        double QuantityBananas = Double.parseDouble(scanner.nextLine());
        double QuantityOranges = Double.parseDouble(scanner.nextLine());
        double QuantityRaspberries = Double.parseDouble(scanner.nextLine());
        double QuantityStrawberry = Double.parseDouble(scanner.nextLine());
        double PriceRaspberries =( PriceStrawberry/2 );
        double PriceOranges = (PriceRaspberries - ( PriceRaspberries * 0.4));
        double PriceBananas = (PriceRaspberries - ( PriceRaspberries * 0.8));
        PriceBananas = PriceBananas * QuantityBananas;
        PriceOranges = PriceOranges * QuantityOranges;
        PriceStrawberry = PriceStrawberry * QuantityStrawberry;
        PriceRaspberries = PriceRaspberries * QuantityRaspberries;
        double PriceAll = ( PriceBananas + PriceOranges + PriceRaspberries + PriceStrawberry );
        System.out.printf("%.2f",PriceAll);

    }
}
