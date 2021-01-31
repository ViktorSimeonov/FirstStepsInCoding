package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursEx = Integer.parseInt(scanner.nextLine());
        int minEx = Integer.parseInt(scanner.nextLine());
        int hoursArr = Integer.parseInt(scanner.nextLine());
        int minArr = Integer.parseInt(scanner.nextLine());
        int minLate;
        int minEarly;

// Late
        if (hoursArr > hoursEx) {
            if ((hoursArr - hoursEx) == 1) {
                if (minArr > minEx) {
                    minLate = minArr - minEx;
                    System.out.println("Late");
                    System.out.printf("1:%d hours after the start", minLate);
                } else if (minArr < minEx) {
                    minLate = (60 - minEx) + minArr;
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", minLate);
                }
                // else if (minArr == minEx)
                else {
                    System.out.println("Late");
                    System.out.println("1:00 hours after the start");
                }
                // разлика по голяма от 1 час при подраняване

            } else if ((hoursArr - hoursEx) > 1) {
                int hoursLate = hoursArr - hoursEx;
                if (minArr > minEx) {
                    minLate = minArr - minEx;
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start",hoursLate, minLate);
                } else if (minArr < minEx) {
                    minLate = (60 - minEx) + minArr;
                    System.out.println("Late");
                    System.out.printf("%d:%d minutes after the start",(hoursLate-1), minLate);
                }
                // else if (minArr == minEx)
                else {
                    System.out.println("Late");
                    System.out.printf("%d:00 hours after the start",hoursLate);
                }
            }
        }
// Early
        else if (hoursArr < hoursEx) {
            if ((hoursEx - hoursArr) == 1) {
                if (minArr > minEx) {
                    minEarly = (60 - minArr) + minEx;
                    if( minEarly >30) {
                        System.out.println("Early");
                        System.out.printf("%d minutes before the start", minEarly);
                    }
                    else if ( minEarly <=30) {
                        System.out.println("On time");
                        System.out.printf("%d minutes before the start", minEarly);
                    }
                } else if (minArr < minEx) {
                    minEarly = minEx - minArr;
                    System.out.println("Early");
                    System.out.printf("1:%d hours before the start", minEarly);
                } else if (minArr == minEx) {
                    System.out.println("Early");
                    System.out.println("1:00 hours before the start");
                }
                //разлика по голяма от 1 час при закъснение
            }else if ( hoursEx - hoursArr >1){
                int hoursLate = hoursEx - hoursArr;
                if (minArr > minEx) {
                    minEarly = (60 - minArr) + minEx;
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start", (hoursLate - 1), minEarly);
                } else if (minArr < minEx) {
                    minEarly = minEx - minArr;
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start", hoursLate, minEarly);
                } else if (minArr == minEx) {
                    System.out.println("Early");
                    System.out.println("%d:00 hours before the start");
                                }
            }
        }
// On time
//else if (hoursArr == hoursEx)
        else  {
            if (minArr > minEx) {
                minLate = minArr - minEx;
                System.out.println("Late");
                System.out.printf("%d minutes after the start", minLate);
            } else if (minArr < minEx) {
                minEarly = minEx - minArr;
                System.out.println("Early");
                System.out.printf("%d minutes before the start", minEarly);
            } else if (minArr == minEx) {
                System.out.println("On time");
            }
        }

    }
}
