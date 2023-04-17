package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.AddReviewRequest;
import kr.megaptera.backend.weekd02.assignment.models.Review;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class ReviewManager {
    private long idCounter;
    private Map<Long, Review> reviews;

    public ReviewManager() {
        idCounter = 0;
        reviews = new HashMap<>();

        add(1, "test", new AddReviewRequest("demo review"));
    }

    public boolean isExist(long id) {
        var product = reviews.get(id);
        return product != null;
    }

    public Review[] getAll(long productId) {
        var filteredReview = new ArrayList<Review>();

        for (var review : reviews.values()) {
            if (review.getProductId() == productId) {
                filteredReview.add(review);
            }
        }

        return filteredReview.toArray(new Review[filteredReview.size()]);
    }

    public Review get(long id) {
        var product = reviews.get(id);
        return product;
    }

    public Review add(
            long productId,
            String userId,
            AddReviewRequest request) {
        var review = new Review(
                ++idCounter,
                productId,
                userId,
                request.getContent());

        reviews.put(review.getId(), review);
        return review;
    }

    public void update(Review product) {
        reviews.replace(product.getId(), product);
    }

    public void remove(long id) {
        reviews.remove(id);
    }
}
