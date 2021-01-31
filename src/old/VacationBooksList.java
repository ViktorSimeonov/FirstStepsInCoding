package old;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int Pages = Integer.parseInt(scanner.nextLine());
        int PagesHour = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());
        int HoursBook = Pages / PagesHour;
        int HoursDay = HoursBook / Days;
        System.out.println(HoursDay);



    }
}
