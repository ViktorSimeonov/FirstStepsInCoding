package ForLoop_Exercise;
//1.	Числа до 1000, завършващи на 7
//import java.util.Scanner;

public class NumbersEndingIn7_01 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        for ( int i = 0;i<= 1000;i++){
            if ( i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
