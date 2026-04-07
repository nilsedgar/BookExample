import java.time.LocalDate;

public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private String nationality;
    private LocalDate birthDate;
    private String biography;
    private String website;

    public Author(int id, String firstName, String lastName, String nationality, LocalDate birthDate, String biography, String website) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.biography = biography;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
