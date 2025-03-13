package ClassAndObject.model;

import java.time.Instant;
import java.util.*;

public class Book {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private Date publishedDate;
    private Set<String> authors;
    //
    private void setBookInfo(Integer id,
                             String uuid,
                             String title,
                             String description,
                             Date publishedDate,
                             Set<String> authors){
        this.id = id;
        this.uuid = uuid;
        this.title = title;
        this.description = description;
        this.publishedDate = publishedDate;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishedDate=" + publishedDate +
                ", authors=" + authors +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBookInfo(1, UUID.randomUUID().toString(),
                "Midnight library", "fantasy", Date.from(Instant.now()), new TreeSet<>(List.of("james", "nick")));
        System.out.println(book);
    }


    }

