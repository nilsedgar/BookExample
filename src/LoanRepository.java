import java.sql.*;
import java.util.ArrayList;

public class LoanRepository {

    private final String URL  = "jdbc:mysql://localhost:3306/librarydb";
    private final String USER = "root";
    private final String PASS = "nisse";

    public void returnLoan(Loan loan) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("UPDATE loans SET return_date=CURRENT_DATE WHERE id=?");
             PreparedStatement stmtTwo = conn.prepareStatement("UPDATE books SET available_copies=available_copies+1 WHERE id=?")) {

            stmt.setInt(1, loan.getLoanId());
            stmtTwo.setInt(1, loan.getBookId());
            int loanRowsAffected = stmt.executeUpdate();
            int bookRowsAffected = stmtTwo.executeUpdate();

            System.out.println("Loans updated: " + loanRowsAffected + "Books updated: " + bookRowsAffected);
        } catch (SQLException e) {
            System.out.println("Fel: " + e.getMessage());
        }
    }

}
