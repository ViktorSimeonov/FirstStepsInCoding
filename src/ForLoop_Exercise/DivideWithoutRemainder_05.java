package ForLoop_Exercise;
//5.	Деление без остатък

import java.util.Scanner;

public class DivideWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for ( int i = 0; i< n;i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if ( currentNumber % 2 == 0){
                p1++;
            }
            if (currentNumber % 3 == 0){
                p2++;
            }if (currentNumber % 4 == 0){
                p3++;
            }
        }
        System.out.printf("%.2f%%%n",(1.0*p1/n*100));
        System.out.printf("%.2f%%%n",(1.0*p2/n*100));
        System.out.printf("%.2f%%%n",(1.0*p3/n*100));

    }
}
