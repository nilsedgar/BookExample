import java.util.ArrayList;

public class BookService {

    BookRepository bookRepository = new BookRepository();
    AuthorRepository authorRepository = new AuthorRepository();
    CategoryRepository categoryRepository = new CategoryRepository();

    public ArrayList<BiggerBookDTO> getAllBooks(){
        ArrayList<Book> books = bookRepository.getAllBooks();
        ArrayList<BiggerBookDTO> dtos = new ArrayList<>();
        for(Book book : books){
            book.setAuthors(authorRepository.getAuthorsByBookId(book.getId()));
            book.setCategories(categoryRepository.getCategoriesByBookId(book.getId()));
            dtos.add(BiggerBookDTO.toDTO(book));
        }
        return dtos;
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
