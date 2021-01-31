package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class AnimalType_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        String classAnimal;
        switch (animal){
            case "dog":
                classAnimal = "mammal";
                System.out.println(classAnimal);
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                classAnimal = "reptile";
                System.out.println(classAnimal);
                break;
            default:
                System.out.println("unknown");
        }

    }
}
