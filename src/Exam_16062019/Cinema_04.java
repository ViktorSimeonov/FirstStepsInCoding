package Exam_16062019;

import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        String countVisitors ;
        int price=0;
        boolean full = false;
        while (!"Movie time!".equals(countVisitors = scanner.nextLine())){
            int peopleVisitors = Integer.parseInt(countVisitors);
            if ( peopleVisitors >capacity){
                full = true;

                break;
            }
            capacity-=peopleVisitors;
            if ( peopleVisitors %3 ==0){
                price+=((peopleVisitors*5)-5);
            }else {
                price += peopleVisitors * 5;
            }
        }
        if (countVisitors.equals("Movie time!")){
            System.out.printf("There are %d seats left in the cinema.%n",capacity);
        }
        if (full){
            System.out.printf("The cinema is full.%n");
        }
        System.out.printf("Cinema income - %d lv.",price);
    }
}
