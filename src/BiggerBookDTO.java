import java.util.ArrayList;

public class BiggerBookDTO {

    private int bookId;
    private String title;
    private String isbn;
    private int yearPublished;
    private int availableCopies;
    private String summary;
    private String language;
    private int pageCount;
    private ArrayList<String> authorNames;
    private ArrayList<String> categoryNames;

    public BiggerBookDTO(int bookId, String title, String isbn, int yearPublished, int availableCopies, String summary, String language, int pageCount, ArrayList<String> authorNames, ArrayList<String> categoryNames) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
        this.availableCopies = availableCopies;
        this.summary = summary;
        this.language = language;
        this.pageCount = pageCount;
        this.authorNames = authorNames;
        this.categoryNames = categoryNames;
    }

    public BiggerBookDTO() {
    }

    public static BiggerBookDTO toDTO(Book book){
        BiggerBookDTO biggerBookDTO = new BiggerBookDTO();
        biggerBookDTO.setBookId(book.getId());
        biggerBookDTO.setTitle(book.getTitle());
        biggerBookDTO.setIsbn(book.getIsbn());
        biggerBookDTO.setLanguage(book.getLanguage());
        biggerBookDTO.setYearPublished(book.getYearPublished());
        biggerBookDTO.setAvailableCopies(book.getAvailableCopies());
        biggerBookDTO.setPageCount(book.getPageCount());
        biggerBookDTO.setSummary(book.getSummary());
        ArrayList<String> authorNames = new ArrayList<>();
        for(Author a : book.getAuthors()){
            authorNames.add(a.getFirstName() + " " + a.getLastName());
        }
        biggerBookDTO.setAuthorNames(authorNames);
        ArrayList<String> categoryNames = new ArrayList<>();
        for(Category c : book.getCategories()){
            categoryNames.add(c.getName());
        }
        biggerBookDTO.setCategoryNames(categoryNames);
        return biggerBookDTO;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public ArrayList<String> getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(ArrayList<String> authorNames) {
        this.authorNames = authorNames;
    }

    public ArrayList<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(ArrayList<String> categoryNames) {
        this.categoryNames = categoryNames;
    }

    @Override
    public String toString() {
        return "BiggerBookDTO{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", yearPublished=" + yearPublished +
                ", availableCopies=" + availableCopies +
                ", summary='" + summary + '\'' +
                ", language='" + language + '\'' +
                ", pageCount=" + pageCount +
                ", authorNames=" + authorNames +
                ", categoryNames=" + categoryNames +
                '}';
    }
}
