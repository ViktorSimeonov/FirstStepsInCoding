package ForLoop_MoreExercises;


public class Clock_09 {
    public static void main(String[] args) {

        int min = 59;
        int hour = 23;
        for (int i = 0; i <= hour; i++) {
            for (int j = 0; j <= min; j++) {
                System.out.printf("%d : %d%n", i, j);

            }
        }
    }
}
