package Exam_16062019;

import java.util.Scanner;

public class Series_01Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameSeries = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episode = Integer.parseInt(scanner.nextLine());
        double timeOfEpisode = Double.parseDouble(scanner.nextLine());
        double result = (seasons*episode*(timeOfEpisode*1.2)+(seasons*10));
        result = Math.floor(result);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",nameSeries,result);
    }
}
