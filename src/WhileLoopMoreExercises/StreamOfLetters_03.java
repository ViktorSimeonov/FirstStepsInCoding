package WhileLoopMoreExercises;

import java.util.Scanner;


public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        You'll want to use the static method Character.toString(char c) to
//        convert the character into a string first.
//        Then you can use the normal string concatenation functions.
//        System.out.println(input.charAt(0));
        String word = "";
        int c = 0;
        int n = 0;
        int o = 0;
        boolean valid= false;
        while (!input.equals("End")) {
            if ( valid = input.matches("\\w+")) {
                switch (input) {
                    case "c":
                        c++;
                        if (c > 1) {
                            word += input;
                        }
                        break;
                    case "o":
                        o++;
                        if (o > 1) {
                            word += input;
                        }
                        break;
                    case "n":
                        n++;
                        if (n > 1) {
                            word += input;
                        }
                        break;
                    default:
                        word += input;
                        break;
                }
                if (c >= 1 && o >= 1 && n >= 1) {
                    System.out.printf("%s ", word);
                    word = "";
                    c = 0;
                    o = 0;
                    n = 0;

                }
            }
            input = scanner.nextLine();
        }

    }
}
