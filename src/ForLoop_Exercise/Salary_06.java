package ForLoop_Exercise;
//6.	Заплата
import java.util.Scanner;

public class Salary_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isFinish = false;
    for( int i=0; i< tabs;i++){
        String currentTab = scanner.nextLine();
        switch (currentTab){
            case "Facebook":
                salary -=150;
                break;
            case "Instagram":
                salary -=100;
                break;
            case "Reddit":
                salary -=50;
                break;
        } if (salary <=0){
            isFinish = true;
            break;
        }
    }
    if (isFinish ){
        System.out.println("You have lost your salary.");
    }else {
        System.out.println(salary);
    }
    }
}
