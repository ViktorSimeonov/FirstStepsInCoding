package ForLoop_Lab;

import java.util.Scanner;

public class NumbersNTo1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for(int i = N; i >= 1;i--){
            System.out.println(i);
        }
    }
}
