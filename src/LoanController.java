import java.util.ArrayList;
import java.util.Scanner;

public class LoanController {

    LoanService loanService = new LoanService();
    Scanner scanner = new Scanner(System.in);

    public void showLoanMenu(){

        boolean active = true;

        while(active){
            System.out.println("------Loan menu--------");
            System.out.println("1. Return loan");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: {
                    System.out.println("Enter the loan id:");
                    int loanId = scanner.nextInt();
                    System.out.println("Enter the book id:");
                    int bookId = scanner.nextInt();
                    loanService.returnLoan(new Loan(loanId, bookId));
                    break;
                }
                case 0:
                    active = false;
                    break;
            }
        }

    }

}
