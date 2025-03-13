package Homework;

import Homework.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;

public class Homework4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setMovieInfo(1, UUID.randomUUID().toString(), "Fast And Furious", "A series of films revolving around street racing, heist, and spies.", "2h 30 mins",
                new TreeSet<>(List.of("Action", "Thriller", "Suspense")));
        Movie movie2 = new Movie();
        movie2.setMovieInfo(2, UUID.randomUUID().toString(), "Avengers: End Game", "After Thanos, an intergalactic warlord, disintegrates half of the universe, the Avengers must reunite and assemble again to reinvigorate their trounced allies and restore balance.",
        "3h 1 mins", new TreeSet<>(List.of("Fantasy", "Action", "Superhero", "Sci-Fi")));
        Movie movie3 = new Movie();
        movie3.setMovieInfo(3,UUID.randomUUID().toString(),"Oppenhiemer", "Oppenheimer and a team of scientists spend years developing and designing the atomic bomb. Their work comes to fruition on July 16, 1945, as they witness the world's first nuclear explosion, forever changing the course of history.",
                "3 hrs", new TreeSet<>(List.of( "Thriler", "Historical drama")));
        Movie movie4 = new Movie();
        movie4.setMovieInfo(4,UUID.randomUUID().toString(), "Deadpool", "Ajax, a twisted scientist, experiments on Wade Wilson, a mercenary, to cure him of cancer and give him healing powers. However, the experiment leaves Wade disfigured and he decides to exact revenge.",

                "2 hrs 30 mins", new TreeSet<>(List.of("Fantasy", "Sci Fi")) );
        Movie movie5 = new Movie();
        movie5.setMovieInfo(5,UUID.randomUUID().toString(), "Titanic", "A tragic love story between Jack and Rose.",
                "2 hrs 5 mins", new TreeSet<>(List.of("Romance", "Drama")));
        List <Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        for(Movie movie : movies){
            System.out.println(movie);
        }
    }
}
