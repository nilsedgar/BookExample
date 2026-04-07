//databasinteraktionen ske
//en metod som heter getAllBooks
//ska returnera en arraylist av books

import java.sql.*;
import java.util.ArrayList;

public class BookRepository {

    private final String URL  = "jdbc:mysql://localhost:3306/librarydb";
    private final String USER = "root";
    private final String PASS = "nisse";

    public ArrayList<Book> getAllBooks(){

        ArrayList<Book> books = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("""
                    SELECT b.*, bd.* FROM books b
                    JOIN book_descriptions bd ON b.id=bd.book_id
                    """);

            while (rs.next()) {
                int bookId = rs.getInt("id");
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                int yearPublished = rs.getInt("year_published");
                int availableCopies = rs.getInt("available_copies");
                int totalCopies = rs.getInt("total_copies");
                String summary = rs.getString("summary");
                String language = rs.getString("language");
                int pageCount = rs.getInt("page_count");

                Book book = new Book(bookId, title, isbn, yearPublished, availableCopies, totalCopies, summary, language, pageCount);
                books.add(book);
            }
        } catch (SQLException e) {
            System.out.println("Fel: " + e.getMessage());
        }
        return books;
    }

//    public ArrayList<Book> searchBooks(String searchTerm) throws SQLException{
//
//        ArrayList<Book> books = new ArrayList<>();
//
//        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
//             Statement stmt = conn.createStatement()) {
//
//            ResultSet rs = stmt.executeQuery("SELECT b.title, b.year_published, b.available_copies, bd.summary, bd.language, bd.page_count, a.first_name, a.last_name FROM books b\n" +
//                    "JOIN book_descriptions bd ON b.id=bd.book_id\n" +
//                    "JOIN book_authors ba ON b.id=ba.book_id\n" +
//                    "JOIN authors a ON a.id=ba.author_id");
//
//            while (rs.next()) {
//                String title = rs.getString("title");
//                int yearPublished = rs.getInt("year_published");
//                int availableCopies = rs.getInt("available_copies");
//                String summary = rs.getString("summary");
//                String language = rs.getString("language");
//                int pageCount = rs.getInt("page_count");
//                String author = rs.getString("last_name") + ", " + rs.getString("first_name");
//
//                Book book = new Book(title, yearPublished, availableCopies, summary, language, pageCount, author);
//                books.add(book);
//            }
//        } catch (SQLException e) {
//            System.out.println("Fel: " + e.getMessage());
//        }
//        return books;
//    }

}
