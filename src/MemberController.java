import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

    MemberService memberService = new MemberService();
    Scanner scanner = new Scanner(System.in);

    public void showMemberMenu(){
        System.out.println("Welcome to the member menu " + Main.loggedInUser.getFirstName());
        boolean active = true;
        while(active){
            System.out.println("1. Show all active loans");
            String choice = scanner.nextLine().trim();
            switch(choice){
                case "1":{
//                    ArrayList<LoanDTO> loansDtos = memberService.getLoansByMember(Main.loggedInUser.getId());
//                    for(LoanDTO loanDto : loansDtos){
//                        System.out.println(loanDto.toString());
//                    }
                }
            }
        }
    }

}
