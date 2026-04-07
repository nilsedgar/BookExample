import java.sql.*;
import java.util.ArrayList;

public class CategoryRepository {

    private final String URL  = "jdbc:mysql://localhost:3306/librarydb";
    private final String USER = "root";
    private final String PASS = "nisse";

    public ArrayList<Category> getCategoriesByBookId(int bookId) {

        ArrayList<Category> categories = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("""
            SELECT * from categories c
            JOIN book_categories bc ON bc.category_id=c.id
            WHERE bc.book_id=?
            """);) {

            stmt.setInt(1, bookId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                categories.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description")
                ));
            }
            return categories;

        } catch (SQLException e) {
            System.out.println("Fel: " + e.getMessage());
        }
        return null;
    }

}
