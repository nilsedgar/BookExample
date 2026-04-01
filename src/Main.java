import java.util.*;

public class Main {

    public static Member loggedInUser = null;

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        LoanController loanController = new LoanController();
        MemberRepository memberRepository = new MemberRepository();
        MemberController memberController = new MemberController();


        System.out.println("Enter your email:");
        Member member = memberRepository.getMemberByEmail(scanner.nextLine().trim());

        System.out.println("Enter password:");
        String password = scanner.nextLine().trim();

        if(password.equals(member.getPassword())){
            loggedInUser = member;
        }

        System.out.println(loggedInUser.getFirstName() + " " +  loggedInUser.getLastName() + " has logged in!");

        boolean active = true;
        while(active) {
            System.out.println("Welcome to the library");
            System.out.println("1. Open Book Menu");
            System.out.println("2. Open Loan Menu");
            System.out.println("3. Open Member Menu");
            int select = scanner.nextInt();
            switch(select){
                case 1:
                    bookController.showBookMenu();
                    break;
                case 2:
                    loanController.showLoanMenu();
                    break;
                case 3:
                    memberController.showMemberMenu();
                    break;
            }
        }


    }
}