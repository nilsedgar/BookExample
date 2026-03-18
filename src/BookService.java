import java.util.ArrayList;

public class BookService {

    BookRepository bookRepository = new BookRepository();

    public ArrayList<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }

}
