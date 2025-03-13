package Homework.model;

import java.util.Set;

public class Movie {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private String time;
    private Set<String> genre;

    public void setMovieInfo(Integer id, String uuid, String title, String description, String time, Set<String> genre){
        this.id = id;
        this.uuid = uuid;
        this.title = title;
        this.description = description;
        this.time = time;
        this.genre = genre;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "\n id=" + id +
                "\n, uuid='" + uuid + '\'' +
                "\n, title='" + title + '\'' +
                "\n, description='" + description + '\'' +
                "\n, time='" + time + '\'' +
                "\n, genre=" + genre +
                '}';
    }
}
