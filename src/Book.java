public class Book {

    private String title;
    private int yearPublished;
    private int availableCopies;
    private String summary;
    private String language;
    private int pageCount;
    private String author;

    public Book(String title, int yearPublished, int availableCopies, String summary, String language, int pageCount, String author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.availableCopies = availableCopies;
        this.summary = summary;
        this.language = language;
        this.pageCount = pageCount;
        this.author = author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title='" + title + '\'' +
                ", Year published=" + yearPublished +
                ", Available copies=" + availableCopies +
                ", Summary='" + summary + '\'' +
                ", Language='" + language + '\'' +
                ", Page count=" + pageCount +
                ", Author='" + author + '\'' +
                '}';
    }


}
