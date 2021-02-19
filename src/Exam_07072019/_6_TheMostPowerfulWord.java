package Exam_07072019;

import java.util.Scanner;

public class _6_TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        double sum = 0;
        int num;
        double theMostPowerful = 0;
        String wordMost = "";
        while (!"End of words".equals(word = scanner.nextLine())) {
            for (int i = 0; i < word.length(); i++) {
                num = word.charAt(i);
                sum += num;
            }
            int let = word.charAt(0);
            if (let == 65 || let == 97 || let == 101 || let == 69 || let == 105
                    || let == 73 || let == 111 || let == 79 || let == 117 || let == 85 || let == 121 || let == 89) {
                sum *= word.length();
            }
            else {
                sum = Math.floor(sum  / word.length());
            }
            if (sum >= theMostPowerful) {
                theMostPowerful = sum;
                wordMost = word;
            }
            sum = 0;
        }
        System.out.printf("The most powerful word is %s - %.0f", wordMost, theMostPowerful);
    }
}
