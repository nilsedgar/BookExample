import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();

        boolean active = true;
        while(active) {
            System.out.println("Welcome to the library");
            System.out.println("1. Open Book Menu");
            int select = scanner.nextInt();
            switch(select){
                case 1:
                    bookController.showBookMenu();
            }
        }


    }
}