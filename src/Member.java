import java.util.Date;

public class Member {
    //ska spegla en member från databasen
    private String userName;
    private Date createdAt;

    public Member(){
        this.createdAt = new Date();
    }

}
