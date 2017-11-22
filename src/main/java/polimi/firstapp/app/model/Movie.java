package polimi.firstapp.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mirco on 19/10/17.
 */

public class Movie {

    @SerializedName("Title") //bind attribute to jason attribute
    @Expose
    private String name;

    @SerializedName("Director")
    @Expose
    private String directorName;

    @SerializedName("Poster")
    @Expose
    private String posterUrl;
    /*
    @SerializedName("Ratings")
    @Expose
    private List<Rating> ratings;
    */

    public String getDirectorName() {
        return directorName;
    }

    public Movie(String name, String directorName) {
        this.directorName = directorName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Title: " + name;
    }

    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Kill Bill","aaa"));
        movies.add(new Movie("Interstellar","bbbb"));
        movies.add(new Movie("Blue Velvet","ccc"));
        movies.add(new Movie("Kill Bill","aaa"));
        movies.add(new Movie("Interstellar","bbbb"));
        movies.add(new Movie("Blue Velvet","ccc"));
        movies.add(new Movie("Kill Bill","aaa"));
        movies.add(new Movie("Interstellar","bbbb"));
        movies.add(new Movie("Blue Velvet","ccc"));
        movies.add(new Movie("Kill Bill","aaa"));
        movies.add(new Movie("Interstellar","bbbb"));
        movies.add(new Movie("Blue Velvet","ccc"));
        movies.add(new Movie("Kill Bill","aaa"));
        movies.add(new Movie("Interstellar","bbbb"));
        movies.add(new Movie("Blue Velvet","ccc"));
        return  movies;
    }
}
