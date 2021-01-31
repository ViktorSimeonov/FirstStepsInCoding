package old;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Days = Integer.parseInt(scanner.nextLine());
        int Cooks = Integer.parseInt(scanner.nextLine());
        int Cake = Integer.parseInt(scanner.nextLine());
        int Waffles = Integer.parseInt(scanner.nextLine());
        int Pancake = Integer.parseInt(scanner.nextLine());
        int AllCake = Cake * 45;
        double AllWaffles = Waffles * 5.8;
        double AllPancake = Pancake *3.2;
        double AllForDay = Cooks * (AllCake + AllWaffles + AllPancake);
        double AllMoney = AllForDay * Days;
        double AllMoneyFinal = AllMoney -(AllMoney / 8);
        System.out.printf("%.2f",AllMoneyFinal);

    }
}
