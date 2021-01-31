package Exam_21032019;

import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeEggs = scanner.nextLine();
        String colourEggs = scanner.nextLine();
        double groupEgs = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (sizeEggs) {
            case "Large":
                switch (colourEggs) {
                    case "Red":
                        price =16;
                        break;
                    case "Green":
                        price =12;
                        break;
                    case "Yellow":
                        price =9;
                        break;
                }
                break;
            case "Medium":
                switch (colourEggs) {
                    case "Red":
                        price =13;
                        break;
                    case "Green":
                        price =9;
                        break;
                    case "Yellow":
                        price =7;
                        break;
                }
                break;
            case "Small":
                switch (colourEggs) {
                    case "Red":
                        price =9;
                        break;
                    case "Green":
                        price =8;
                        break;
                    case "Yellow":
                        price =5;
                        break;
                }
                break;
        }
        System.out.printf("%.2f leva.",((price*groupEgs)*0.65));
    }
}
