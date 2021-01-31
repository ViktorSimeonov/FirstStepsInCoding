package WhileLoop_Lab;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum=0;
        while ( sum < num){
            sum+=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}
