package Exam_16062019;

import java.util.Scanner;

public class MovieStars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String actor;
        double payment ;
        boolean moneyFinish = false;
        while (!"ACTION".equals(actor = scanner.nextLine())){
                int lengthName = actor.length();
            if ( lengthName <=15 ){
                payment = Double.parseDouble(scanner.nextLine());
                budget-=payment;
            }else {
                payment = budget*0.2;
                budget-=payment;
            }
            if ( budget < 0){
                moneyFinish=true;
                break;
            }
        }
       if ( moneyFinish){
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.",budget);
        }
    }
}
