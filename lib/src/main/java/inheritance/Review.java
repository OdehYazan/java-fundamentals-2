package inheritance;

public class Review {
    // Instance properties
    private String body;
    private int stars;
    private String author;
    private String movie;

    Review(String body, int stars, String author, String movie) {
        this.body = body;
        this.stars = stars;
        this.author = author;
        this.movie = movie;
    }

    Review(String body, String author,int stars) {
        this.body = body;
        this.stars = stars;
        this.author = author;
    }


    public String toString() {
        String rev = body + ",  Rating: " + stars + ", Author: " + author;

        if (this.movie != null) {
            rev += ", Movie: " + movie;
        }
        return rev;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public int getStars() {
        return this.stars;
    }


}
