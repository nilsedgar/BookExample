import java.sql.*;
import java.util.ArrayList;

public class AuthorRepository {
    private final String URL  = "jdbc:mysql://localhost:3306/librarydb";
    private final String USER = "root";
    private final String PASS = "nisse";
    //getAuthorsByBookId

    public ArrayList<Author> getAuthorsByBookId(int bookId) {

        ArrayList<Author> authors = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("""
            SELECT * from authors a
            JOIN book_authors ba ON ba.author_id=a.id
            JOIN author_descriptions ad ON ad.author_id=a.id
            WHERE ba.book_id=?
            """);) {

            stmt.setInt(1, bookId);

            ResultSet rs = stmt.executeQuery();

           while(rs.next()){
               authors.add(new Author(
                       rs.getInt("id"),
                       rs.getString("first_name"),
                       rs.getString("last_name"),
                       rs.getString("nationality"),
                       rs.getDate("birth_date").toLocalDate(),
                       rs.getString("biography"),
                       rs.getString("website")
               ));
            }
           return authors;

        } catch (SQLException e) {
            System.out.println("Fel: " + e.getMessage());
        }
        return null;
    }

}
