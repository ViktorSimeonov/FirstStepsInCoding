package Exam_21032019;

import java.util.Scanner;

public class EasterEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEggs = Integer.parseInt(scanner.nextLine());
        String colour; //= scanner.nextLine();
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = Integer.MIN_VALUE;
        String maxColour ="";
        for (int i = 1; i <= numberOfEggs; i++) {
            colour = scanner.nextLine();
            switch (colour) {
                case "red":
                    red++;
                    if (red > max) {
                        max = red;
                        maxColour = colour;
                    }
                    break;
                case "orange":
                    orange++;
                    if (orange > max) {
                        max = orange;
                        maxColour = colour;
                    }
                    break;
                case "blue":
                    blue++;
                    if (blue > max) {
                        max = blue;
                        maxColour = colour;
                    }
                    break;
                case "green":
                    green++;
                    if (green > max) {
                        max = green;
                        maxColour = colour;
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n",red);
        System.out.printf("Orange eggs: %d%n",orange);
        System.out.printf("Blue eggs: %d%n",blue);
        System.out.printf("Green eggs: %d%n",green);
        System.out.printf("Max eggs: %d -> %s%n",max,maxColour);
    }
}

