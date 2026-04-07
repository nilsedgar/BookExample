import java.sql.*;
import java.util.ArrayList;

public class MemberRepository {

    private final String URL  = "jdbc:mysql://localhost:3306/librarydb";
    private final String USER = "root";
    private final String PASS = "nisse";

    public Member getMemberByEmail(String email) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("SELECT * from members WHERE email=?");) {

            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return new Member(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"), rs.getString("password"));
            }

        } catch (SQLException e) {
            System.out.println("Fel: " + e.getMessage());
        }
        return null;
    }

//    public ArrayList<Loan> getLoansByMember(int memberId){
//        ArrayList<Loan> loans = new ArrayList<>();
//
//        try(Connection conn = DriverManager.getConnection(URL, USER, PASS);
//        PreparedStatement stmt = conn.prepareStatement("""
//                SELECT loans.*, books.*, members.* from loans
//                JOIN books ON loans.book_id=books.id
//                JOIN members ON loans.member_id=members.id
//                WHERE member_id=?
//                """
//        )){
//
//            stmt.setInt(1, memberId);
//            ResultSet rs = stmt.executeQuery();
//
//            while(rs.next()){
//                loans.add(new Loan(
//                        rs.getInt("loans.id"),
//                        new Book(rs.getString("books.title")),
//                        new Member(rs.getInt("members.id"),
//                                rs.getString("members.first_name"),
//                                rs.getString("members.last_name"),
//                                rs.getString("members.email"),
//                                rs.getString("members.password")),
//                        rs.getDate("loans.loan_date").toLocalDate(),
//                        rs.getDate("loans.due_date").toLocalDate()
//                        ));
//            }
//
//            return loans;
//
//        }catch(SQLException e){
//            System.out.println("A database error has occurred " + e.getMessage());
//        }
//
//        return null;
//    }

}
