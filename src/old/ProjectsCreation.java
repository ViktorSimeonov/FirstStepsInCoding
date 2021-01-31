package old;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String NameArchitect = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = 3 * projects;
        System.out.printf ("The architect %s will need %d hours to complete %d project/s.", NameArchitect,hours, projects);

    }
}
