package ForLoop_MoreExercises;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int patientLookAfter = 0;
        int patientNoExam = 0;
        for (int i = 1; i <= days; i++) {
            int patient = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && patientNoExam > patientLookAfter) {
                doctors++;
            }
            if (patient > doctors) {
                patientNoExam += (patient - doctors);
                patientLookAfter += doctors;
            } else {
                patientLookAfter += patient;
            }
        }
        System.out.printf("Treated patients: %d.%n", patientLookAfter);
        System.out.printf("Untreated patients: %d.", patientNoExam);
    }
}


