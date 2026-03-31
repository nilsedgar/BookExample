public class LoanService {

    LoanRepository loanRepository = new LoanRepository();

    public void returnLoan(Loan loan){
        loanRepository.returnLoan(loan);
    }

}
