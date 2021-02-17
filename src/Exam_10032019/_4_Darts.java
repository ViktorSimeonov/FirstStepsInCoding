package Exam_10032019;

import java.util.Scanner;

public class _4_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namePlayer = scanner.nextLine();
        String typeField;
        int leftPoint = 301;
        int shots = 0;
        int outOfTarget = 0;
        int currentPoint = 0;
        while (!"Retire".equals(typeField = scanner.nextLine())) {
            int hitPoint = Integer.parseInt(scanner.nextLine());
            shots++;
            if ("Single".equals(typeField)) {
                currentPoint = hitPoint;
            } else if ("Double".equals(typeField)) {
                currentPoint = (hitPoint * 2);
            } else if ("Triple".equals(typeField)) {
                currentPoint = (hitPoint * 3);
            }
            if (currentPoint > leftPoint) {
                outOfTarget++;
                continue;
            }
            leftPoint-=currentPoint;

            if (leftPoint == 0) {
                System.out.printf("%s won the leg with %d shots.", namePlayer, (shots - outOfTarget));
                break;
            }

        }
        if (typeField.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", namePlayer, outOfTarget);
        }
    }
}
