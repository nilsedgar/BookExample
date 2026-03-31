import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        LoanController loanController = new LoanController();

        boolean active = true;
        while(active) {
            System.out.println("Welcome to the library");
            System.out.println("1. Open Book Menu");
            System.out.println("2. Open Loan Menu");
            int select = scanner.nextInt();
            switch(select){
                case 1:
                    bookController.showBookMenu();
                    break;
                case 2:
                    loanController.showLoanMenu();
                    break;
            }
        }


    }
}