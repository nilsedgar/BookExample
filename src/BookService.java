import java.util.ArrayList;

public class BookService {

    BookRepository bookRepository = new BookRepository();

    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> books = bookRepository.getAllBooks();
        return books;
    }

    public ArrayList<BookDTO> getAllBookTitlesAndSummaries(){
        ArrayList<Book> books = bookRepository.getAllBooks();
        ArrayList<BookDTO> bookDTOs = new ArrayList<>();
        for(Book book : books){
            bookDTOs.add(BookDTO.mapToDto(book));
        }
        return bookDTOs;
    }

}
