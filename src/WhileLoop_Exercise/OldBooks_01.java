package WhileLoop_Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfAnisBook = scanner.nextLine();
        String nextBook = scanner.nextLine();
        int bookChecked = 0;
        boolean isFind = false;
        while (!nextBook.equals("No More Books")) {
            if (nextBook.equals((nameOfAnisBook))) {
                isFind = true;
                break;
            }
            nextBook = scanner.nextLine();
            bookChecked++;
        }
        if (isFind) {
            System.out.printf("You checked %d books and found it.", bookChecked);
        } else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n", bookChecked);
        }
    }
}
