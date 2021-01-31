package WhileLoop_Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int cake = w*l;
        int peaceTaken = 0;

        String command = scanner.nextLine();
        while (!command.equals("STOP")){
            peaceTaken++;
            int peaceCake = Integer.parseInt(command);
            cake-=peaceCake;
            if ( cake > 0){
                command = scanner.nextLine();
            }else {
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cake));
                break;            }

        } if (command.equals("STOP")) {
            System.out.printf("%d pieces are left.", cake);
        }
    }
}
