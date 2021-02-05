package Exam_07042021;

import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfMovie = Integer.parseInt(scanner.nextLine());
        double highRating = Double.MIN_VALUE;
        double lowRating = Double.MAX_VALUE;
        double middleRating = 0;
        String bestMovie = "";
        String worstMovie ="";
        for (int i = 1; i <= countOfMovie; i++) {

            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            middleRating+=rating;
            if (rating >= highRating){
                highRating=rating;
                bestMovie=movieName;
            }else if (rating < lowRating){
                lowRating=rating;
                worstMovie=movieName;
            }

        }
        System.out.printf("%s is with highest rating: %.1f%n",bestMovie,highRating);
        System.out.printf("%s is with lowest rating: %.1f%n",worstMovie,lowRating);
        System.out.printf("Average rating: %.1f",(middleRating/countOfMovie));
    }
}
