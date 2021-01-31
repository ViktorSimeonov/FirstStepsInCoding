package WhileLoop_Exercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double leva = Double.parseDouble(scanner.nextLine());
        double stotinki = Math.floor(leva * 100);
        int count = 0;
        while (stotinki > 0) {
            if (stotinki >= 200) {
                stotinki -= 200;
                count++;
            }else if ( stotinki >= 100){
                stotinki-=100;
                count++;
            }else if (stotinki >=50){
                stotinki-=50;
                count++;
            }else if ( stotinki >=20){
                stotinki-=20;
                count++;
            }else if ( stotinki >=10){
                stotinki-=10;
                count++;
            }else if ( stotinki >=5){
                stotinki-=5;
                count++;
            }else if ( stotinki >=2){
                stotinki-=2;
                count++;
            }else if ( stotinki >=1){
                stotinki-=1;
                count++;
            }

        } System.out.println(count);
    }
}
