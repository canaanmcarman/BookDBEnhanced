import java.util.Scanner;

public class BookDB {
    public static void main(String[] args) {
        String SKU;
        Scanner kbd = new Scanner(System.in);
        //BookClass book1 = new BookClass();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Look up book by SKU: ");
            BookClass book1 = new BookClass(kbd.nextLine());
            System.out.println(book1.getDisplayText());
        }
    }
}

