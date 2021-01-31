package ForLoop_Lab;

import java.util.Scanner;

public class CharacterSequence_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        a.length(); - това връща интиджър който съдържа дължината на текста
//       char myChar = a.charAt(0); в myChar записва пръвия символ от думата
        for (int i = 0; i < input.length();i++){
             System.out.println(input.charAt(i));
        }
    }
}
