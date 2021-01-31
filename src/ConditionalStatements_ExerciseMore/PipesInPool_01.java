package ConditionalStatements_ExerciseMore;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double firstPipe = P1*H;
        double secondPipe = P2*H;
        double percent = ( firstPipe +secondPipe)/V*100;

        if ( percent <=100 ){
            System.out.printf("The pool is %.2f%% full." +
                    " Pipe 1: %.2f%%. Pipe 2: %.2f%%",percent,((firstPipe/(firstPipe+secondPipe))*100)
                    ,((secondPipe/(firstPipe+secondPipe))*100));
        }else {
            double overflow = (firstPipe+secondPipe) - V;
            System.out.printf("For %.2f hours the pool overflows wit %.2f liters.",H,overflow);
        }
    }
}
