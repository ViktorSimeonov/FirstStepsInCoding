package NestedLoops_Lab;

import java.util.Scanner;

public class Clock_01 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.printf(String.format("%d:%d%n",i,j));
            }
        }
    }
}
