package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Restaurant implements Reviews {


    private String name;
    protected int rating;
    private String priceCategory;
    protected LinkedList<Review> reviews;
    private List<Integer> starRatings;


    Restaurant(String name, String priceCategory) {
        this.name = name;
        this.rating = -1;
        this.priceCategory = priceCategory;
        this.reviews = new LinkedList();
        this.starRatings = new ArrayList<>();
    }


    public String toString() {
        String ratings;
        if (rating == -1) {
             ratings = "no rate";
        } else {
            ratings = String.valueOf(this.rating);
        }
        String aboutRestaurant = "Name: " + name + ", Stars: " + ratings + ", Price : " + priceCategory ;
        for (Review review : reviews) {
            aboutRestaurant += "Review: " + review.toString() + "\n";
        }
        return aboutRestaurant;
    }
    public void addReview(Review review) {
        reviews.add(review);

    }

}