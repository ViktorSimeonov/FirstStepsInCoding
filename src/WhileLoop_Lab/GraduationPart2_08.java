package WhileLoop_Lab;

import java.util.Scanner;

public class GraduationPart2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        // from 1 to 12
        int grade = 1; // започваме от 1-ви клас
        double sum = 0;
        int timeCurrentClass = 0;
        boolean isExcluded = false;
        while (grade <= 12) {
            double currentMark = Double.parseDouble(scanner.nextLine());
            if (currentMark < 4) {
                timeCurrentClass++;
                if (timeCurrentClass == 2) {
                    System.out.printf("%s has been excluded at %d grade", studentName, grade);
                    isExcluded = true;
                    break;
                }
                continue;
            }
            sum += currentMark;
            // ЗАДЪЛЖИТЕЛНО УВЕЛИЧАВАМЕ КЛАСА , ЗА ДА СЕ
            // ПРОМЕНЯ УСЛОВИЕТО НА ЦИКЪЛА
            grade++;
        }
        if (!isExcluded) {
            double averageMark = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageMark);
        }
    }
}
