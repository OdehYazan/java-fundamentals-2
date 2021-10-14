package inheritance;

import java.util.LinkedList;

public class Theater implements Reviews {
    protected LinkedList<Review> reviews;
    protected String name;
    protected LinkedList<String> currentMovies;

    Theater(String name) {
        this.name = name;
        this.reviews = new LinkedList<>();
        this.currentMovies = new LinkedList<>();
    }

    public String toString() {
        String about = "Theater: " + name + ", Movies: " + currentMovies + "\n";

        for (Review review : reviews) {
            about += "Review: " + review.toString() + "\n";
        }
        return about;
    }

    public void addMovie(String movie) {
        currentMovies.add(movie);
    }

    public void removeMovie(String movie) {
        currentMovies.remove(movie);
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
}