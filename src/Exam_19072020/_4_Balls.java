package Exam_19072020;

import java.util.Scanner;

public class _4_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String colour;
        int points = 0;
        int r = 0;
        int y = 0;
        int w = 0;
        int o = 0;
        int b = 0;
        int no = 0;
        for (int i = 1; i <= n; i++) {
            colour = scanner.nextLine();
            switch (colour) {
                case "red":
                    points += 5;
                    r++;
                    break;
                case "yellow":
                    y++;
                    points += 15;
                    break;
                case "white":
                    points += 20;
                    w++;
                    break;
                case "orange":
                    points += 10;
                    o++;
                    break;
                case "black":
                    points /= 2;
                    b++;
                    break;
                default:
                    no++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n",points);
        System.out.printf("Points from red balls: %d%n",r);
        System.out.printf("Points from orange balls: %d%n",o);
        System.out.printf("Points from yellow balls: %d%n",y);
        System.out.printf("Points from white balls: %d%n",w);
        System.out.printf("Other colors picked: %d%n",no);
        System.out.printf("Divides from black balls: %d%n",b);
    }
}
