package ForLoop_Lab;

import java.util.Scanner;

public class VowelsSum_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        //hello
        for(int i = 0;i< input.length() ; i++){
            //ако символа е равен на някой от таблицата ...
//            a	e	i	o	u
//            1	2	3	4	5

            switch (input.charAt(i)){
                case 'a':
                    sum =sum+1;
                    break;
                case'e':
                    sum = sum+2;
                    break;
                case 'i':
                    sum = sum+3;
                    break;
                case 'o':
                    sum = sum +4;
                    break;
                case'u':
                    sum = sum +5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
