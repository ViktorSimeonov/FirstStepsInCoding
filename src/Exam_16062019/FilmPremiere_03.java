package Exam_16062019;

import java.util.Scanner;

public class FilmPremiere_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        String paket = scanner.nextLine();
        double ticket = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (movie) {
            case "John Wick":
                switch (paket) {
                    case "Drink":
                        price +=(ticket*12);
                        break;
                    case "Popcorn":
                        price +=(ticket*15);
                        break;
                    case "Menu":
                        price +=(ticket*19);
                        break;
                }

                break;
            case "Star Wars":
                switch (paket) {
                    case "Drink":
                        price +=(ticket*18);
                        break;
                    case "Popcorn":
                        price +=(ticket*25);
                        break;
                    case "Menu":
                        price +=(ticket*30);
                        break;
                }
                if (ticket>=4){
                    price*=0.7;
                }
                break;
            case "Jumanji":
                switch (paket) {
                    case "Drink":
                        price +=(ticket*9);
                        break;
                    case "Popcorn":
                        price +=(ticket*11);
                        break;
                    case "Menu":
                        price +=(ticket*14);
                        break;
                }
                if (ticket==2){
                    price*=0.85;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.",price);
    }
}
