package Exam_21032019;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countKozunaci = Integer.parseInt(scanner.nextLine());
        String points = "";
        int maxPoint = Integer.MIN_VALUE;
        String bestCook = "";
        for (int i = 0; i < countKozunaci; i++) {
            String nameBacker = scanner.nextLine();
            int sumOfPoints=0;
               while (!"Stop".equals(points = scanner.nextLine())){
                sumOfPoints += Integer.parseInt(points);
            }
            System.out.printf("%s has %d points.%n",nameBacker,sumOfPoints);
               if(sumOfPoints > maxPoint){
                   maxPoint = sumOfPoints;
                    bestCook = nameBacker;
                   System.out.printf("%s is the new number 1!%n",nameBacker);
               }

        }
        System.out.printf("%s won competition with %d points!",bestCook,maxPoint);
    }
}
