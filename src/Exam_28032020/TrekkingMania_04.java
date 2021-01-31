package Exam_28032020;

import java.util.Scanner;

public class TrekkingMania_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double allPeople  = 0;
        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=numberOfGroups ;i++) {
            int countOfPlayer = Integer.parseInt(scanner.nextLine());
            allPeople +=countOfPlayer;
            if ( countOfPlayer <= 5){
                musala+=countOfPlayer;
            }else if ( countOfPlayer <= 12){
                monblan+=countOfPlayer;
            }else if ( countOfPlayer <= 25){
                kilimandjaro+=countOfPlayer;
            }else if ( countOfPlayer <= 40){
                k2+=countOfPlayer;
            }else if ( countOfPlayer >= 41){
                everest+=countOfPlayer;
            }
        }
        System.out.printf("%.2f%%%n",(musala/allPeople)*100);
        System.out.printf("%.2f%%%n",(monblan/allPeople)*100);
        System.out.printf("%.2f%%%n",(kilimandjaro/allPeople)*100);
        System.out.printf("%.2f%%%n",(k2/allPeople)*100);
        System.out.printf("%.2f%%%n",(everest/allPeople)*100);
    }
}
