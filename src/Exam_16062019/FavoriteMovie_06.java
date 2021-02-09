package Exam_16062019;

import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameMovie;
        char testChar;
        int numOfTestChar;
        int countMovie = 0;
    //    int sumAllChar;
        int bestMovie = Integer.MIN_VALUE;
        String myFavoriteMovie = "";
        while (!"STOP".equals(nameMovie = scanner.nextLine())) {
            countMovie++;
            int sumAllChar=0;
            int lengthOfMovie = nameMovie.length();
            for (int i = 0; i < lengthOfMovie; i++) {
                testChar = nameMovie.charAt(i);// take the char
                numOfTestChar = testChar; // give the Integer value of the char
                sumAllChar += numOfTestChar;
                if (numOfTestChar >= 97 && numOfTestChar <= 122) {
                    sumAllChar -= (lengthOfMovie * 2);

                } else if (numOfTestChar >= 65 && numOfTestChar <= 90) {
                    sumAllChar -= lengthOfMovie;
                }

                if (sumAllChar >= bestMovie) {
                    bestMovie = sumAllChar;
                    myFavoriteMovie = nameMovie;
                }
            }
            if (countMovie == 7) {
                System.out.println("The limit is reached.");

                break;
            }
        }
            System.out.printf("The best movie for you is %s with %d ASCII sum.", myFavoriteMovie, bestMovie);
    }
}
