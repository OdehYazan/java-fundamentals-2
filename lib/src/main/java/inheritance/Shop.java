package inheritance;

import java.util.LinkedList;

public class Shop implements Reviews {


    private String name;
    private String description;
    private String price;
    protected LinkedList<Review> reviews;


    Shop(String name, String description, String price) {
        this.name = name;
        this.price = price;
        this.description = description;

        this.reviews = new LinkedList();
    }


    public String toString() {
        String about = "Shop: " + name + ", Description: " + description + ", Price: " + price + "\n";
        for (Review review : reviews) {
            about += "Review: " + review.toString() + "\n";
        }
        return about;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
}