import java.util.Date;

/**
 * Created by gbagony on 2017/2/23.
 */
public class Book {
    private String name;
    private Date publishDate;

    public Book(String name, Date publishDate) {
        this.name = name;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
