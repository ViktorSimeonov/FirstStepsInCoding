package ConditionalStatementsNested_MoreExercises;

import java.util.Scanner;

public class PointOnRectangleBorder_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        boolean onLineX = ((x == x1 || x == x2) && (y >= y1 && y <= y2));
        boolean onLineY = ((y == y1 || y == y2) && (x >= x1 && x <= x2));
        // коментарите са за отделни случай вътре и отделен вън :)
//        boolean inSide = ((x > x1 && x < x2) && (y > y1 && y < y2));
        if (onLineX || onLineY) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
//        else if (inSide){
//            System.out.println("Inside");
//        }else{
//            System.out.println("Outside");
//        }
    }
}
