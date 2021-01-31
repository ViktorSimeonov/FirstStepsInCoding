package WhileLoop_Lab;

import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        String info = scanner.nextLine();
        double volume = w*l*h;

        while(!info.equals("Done")){
            int countBox = Integer.parseInt(info);
            volume = volume - countBox;
            if ( volume <=0){

                break;
            }
            info = scanner.nextLine();
        } if (volume > 0){
            System.out.printf("%.0f Cubic meters left.",volume);
        }else {
            double notEnoughSpace = Math.abs(volume);
            System.out.printf("No more free space! You need %.0f Cubic meters more.",notEnoughSpace);

        }
    }
}
