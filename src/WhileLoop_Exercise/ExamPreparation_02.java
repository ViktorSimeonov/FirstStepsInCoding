package WhileLoop_Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badEvaluation = Integer.parseInt(scanner.nextLine());
        String nameOfTask = scanner.nextLine();
        int evaluation ;
        int numBadEvaluation = 0;
        double score = 0;
        double numScore = 0;
        boolean isBadEvaluation = false;
        String lastProblem ="";
        while (!nameOfTask.equals("Enough")) {
            evaluation = Integer.parseInt(scanner.nextLine());
            score += evaluation;
            numScore++;
            lastProblem = nameOfTask;
            if (evaluation <= 4) {
                numBadEvaluation++;
            }
            if (numBadEvaluation == badEvaluation) {
                isBadEvaluation = true;
                break;
            }
            nameOfTask = scanner.nextLine();

        }if ( isBadEvaluation){
            System.out.printf("You need a break, %d poor grades.",numBadEvaluation);
        }else {
            System.out.printf("Average score: %.2f%n",(score/numScore));
            System.out.printf("Number of problems: %.0f%n",numScore);
            System.out.printf("Last problem: %s%n",lastProblem);
        }
    }
}
