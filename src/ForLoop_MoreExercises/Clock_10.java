package ForLoop_MoreExercises;


public class Clock_10 {
    public static void main(String[] args) {
        int sec = 59;
        int min = 59;
        int hour = 23;
        for (int i = 0; i <= hour; i++) {
            for (int j = 0; j <= min; j++) {
                for ( int k= 0; k<=sec;k++)
//                System.out.printf("%d : %d : %d%n", i, j,k);
                System.out.println(String.format("%d : %d : %d", i, j, k));
            }
        }
    }
}
