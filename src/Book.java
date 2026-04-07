import java.util.ArrayList;

public class Book {

    private int id;
    private String title;
    private String isbn;
    private int yearPublished;
    private int availableCopies;
    private int totalCopies;
    private String summary;
    private String language;
    private int pageCount;
    private ArrayList<Author> authors;
    private ArrayList<Category> categories;

    public Book(int id, String title, String isbn, int yearPublished, int availableCopies, int totalCopies, String summary, String language, int pageCount, ArrayList<Author> authors, ArrayList<Category> categories) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
        this.availableCopies = availableCopies;
        this.totalCopies = totalCopies;
        this.summary = summary;
        this.language = language;
        this.pageCount = pageCount;
        this.authors = authors;
        this.categories = categories;
    }

    public Book(int id, String title, String isbn, int yearPublished, int availableCopies, int totalCopies, String summary, String language, int pageCount) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
        this.availableCopies = availableCopies;
        this.totalCopies = totalCopies;
        this.summary = summary;
        this.language = language;
        this.pageCount = pageCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
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

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", yearPublished=" + yearPublished +
                ", availableCopies=" + availableCopies +
                ", totalCopies=" + totalCopies +
                ", summary='" + summary + '\'' +
                ", language='" + language + '\'' +
                ", pageCount=" + pageCount +
                ", authors=" + authors +
                ", categories=" + categories +
                '}';
    }
}
