public class BookDTO {

    private String title;
    private String summary;

    public BookDTO(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public static BookDTO mapToDto(Book book){
        return new BookDTO(book.getTitle(), book.getSummary());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return
                "Title='" + title + '\'' +
                ", Summary='" + summary;
    }
}
