package kr.megaptera.backend.weekd02.assignment.controllers;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import kr.megaptera.backend.weekd02.assignment.utils.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ReviewControllerTests {
    @Autowired
    private ReviewController reviewController;

    @DisplayName("contextLoads")
    void contextLoads() {
        assert reviewController != null;
    }

    @DisplayName("상품에 리뷰 작성")
    @Test
    void postReviews() {
        int productId = 1;
        String requestPath = "/products/%d/reviews".formatted(productId);
        HashMap<String, String> requestBody = new HashMap<>() {{
            put("key", "value");
        }};

        String expectedResponseBody = "상품에 리뷰 작성\n";

        ExtractableResponse<Response> response = ApiClient._post(requestPath, requestBody);

        // then
        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("상품에 리뷰 수정")
    @Test
    void putReviews() {
        int productId = 1;
        String requestPath = "/products/%d/reviews".formatted(productId);
        HashMap<String, String> requestBody = new HashMap<>() {{
            put("key", "value");
        }};

        String expectedResponseBody = "상품에 리뷰 수정\n";

        ExtractableResponse<Response> response = ApiClient._put(requestPath, requestBody);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("상품에 리뷰 삭제")
    @Test
    void deleteReviews() {
        int productId = 1;
        String requestPath = "/products/%d/reviews".formatted(productId);
        String requestBody = "ReviewDTO";

        String expectedResponseBody = "상품에 리뷰 삭제\n";

        ExtractableResponse<Response> response = ApiClient._delete(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }
}
