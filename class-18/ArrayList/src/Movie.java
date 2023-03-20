import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String director;
    private int place;

    public Movie() {
    }

    public Movie(String name, String director, int place) {
        this.name = name;
        this.director = director;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return this.place + ". Movie name: " + this.name +
                "\nDirector: " + this.director;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Godfather", "Francis Coppola", 6);
        Movie movie2 = new Movie("The Shawshank Redemption", "Frank Darabont", 2);
        Movie movie3 = new Movie("The Dark Knight", "Christopher Nolan", 5);
        Movie movie4 = new Movie("The Godfather II", "Francis Coppola", 4);
        Movie movie5 = new Movie("The Lord of the Rings III", "Peter Jackson", 1);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        System.out.println("List of movies: ");
        movies.forEach((movie) -> System.out.println(movie.toString()));
        movies.sort((mv1, mv2) -> mv1.getPlace() - mv2.getPlace());
        System.out.println("My favorite movies: ");
        movies.forEach((movie) -> System.out.println("-----------------\n" + movie.toString()));
    }
}
