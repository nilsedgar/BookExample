import java.util.ArrayList;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();

    public ArrayList<LoanDTO> getLoansByMember(int memberId){
        ArrayList<Loan> loans = memberRepository.getLoansByMember(memberId);
        ArrayList<LoanDTO> dtos = new ArrayList<>();
        for (Loan loan : loans){
            dtos.add(new LoanDTO(loan.getLoanId(), loan.getBook().getTitle(), loan.getLoanDate(), loan.getDueDate()));
        }
        return dtos;
    }

}
