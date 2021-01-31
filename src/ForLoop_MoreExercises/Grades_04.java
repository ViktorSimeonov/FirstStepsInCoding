package ForLoop_MoreExercises;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double topStudents = 0;
        double between4and5 = 0;
        double between3and4 = 0;
        double fail = 0;
        double average = 0;
        for ( int i = 1;i<=students;i++) {
            double evaluation = Double.parseDouble(scanner.nextLine());
            average +=evaluation;
            if (evaluation >=2 && evaluation <3 ){
                fail++;
            }else if ( evaluation >= 3 && evaluation <4 ){
                between3and4++;
            }else if ( evaluation >= 4 && evaluation <5 ){
                between4and5++;
            }else {
                topStudents++;
            }
        }
        System.out.printf("Top students: %.2f%%%n",((topStudents/students)*100));
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",((between4and5/students)*100));
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",((between3and4/students)*100));
        System.out.printf("Fail: %.2f%%%n",((fail/students)*100));
        System.out.printf("Average: %.2f%n",(average/students));
    }
}
