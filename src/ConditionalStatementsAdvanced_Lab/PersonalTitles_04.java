package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        if ("m".equals(sex)) {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else if (sex.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        }
//        това е същата задача но със switch
//        switch (sex) {
//            case "m":
//                System.out.println(age < 16 ? "Master" : "Mr.");
//                break;
//            case "f":
//                System.out.println(age < 16 ? "Miss" : "Ms.");
//                break;
    }
}
