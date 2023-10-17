import java.util.Date;

public class Cat {
    private int id;
    private String family;
    private Date dateCreated;
    public Cat(int newId, String newFamily, Date newDateCreated) {
        id = newId;
        family = newFamily;
        dateCreated = newDateCreated;
    }

    public int getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
