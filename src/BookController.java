import java.util.ArrayList;
import java.util.Scanner;

//Menyn
//switch, while, scanner
//ska ha ett alt att visa alla böcker
//kallar på bookRepository.getAllBooks
public class BookController {

    BookService bookService = new BookService();
    Scanner scanner = new Scanner(System.in);

    public void showBookMenu(){

        boolean active = true;

        while(active){
            System.out.println("------Book menu--------");
            System.out.println("1. Show all books");
            System.out.println("2. Show all book summaries and titles");
            System.out.println("3. Search books");
            System.out.println("4. Add book");
            System.out.println("5. Update book");
            System.out.println("6. Delete book");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: {
                    ArrayList<Book> books = bookService.getAllBooks();
                    for (Book b : books) {
                        System.out.println(b.toString());
                    }
                    break;
                }
                case 2: {
                    ArrayList<BookDTO> bookDTOS = bookService.getAllBookTitlesAndSummaries();
                    for (BookDTO bookDTO : bookDTOS){
                        System.out.println(bookDTO.toString());
                    }
                    break;
                }

                case 0:
                    active = false;
                    break;
            }
        }

    }

}
