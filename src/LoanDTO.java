import java.time.LocalDate;

public class LoanDTO {

    private int loanId;
    private String bookTitle;
    private LocalDate loanDate;
    private LocalDate dueDate;

    public LoanDTO(int loanId, String bookTitle, LocalDate loanDate, LocalDate dueDate) {
        this.loanId = loanId;
        this.bookTitle = bookTitle;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return
                "ID: " + loanId +
                ", Title: '" + bookTitle + '\'' +
                ", Loan date: " + loanDate +
                ", Due date: " + dueDate;
    }
}
