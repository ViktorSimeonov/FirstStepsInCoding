package old;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Rent = Double.parseDouble(scanner.nextLine());
        double Cake = Rent * 0.2;
        double Drinks = Cake - ( Cake * 0.45 );
        double Animator = Rent / 3;
        double Budget = Rent + Cake + Drinks + Animator;
        System.out.println(Budget);




    }}
