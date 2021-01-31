package NestedLoops_Lab;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFlore = Integer.parseInt(scanner.nextLine());
        int totalRooms = Integer.parseInt(scanner.nextLine());
        for (int flore = totalFlore; flore >= 1; flore--) {
            for (int room = 0; room < totalRooms; room++) {
                if ( flore == totalFlore){
                System.out.printf("L%d%d ",flore, room);
                }else if (flore % 2 == 0){
                    System.out.printf("O%d%d ",flore, room);
                }else {
                    System.out.printf("A%d%d ",flore, room);
                }
            }
            System.out.println();
        }
    }
}
