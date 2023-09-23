package kr.megaptera.backend.weekd02.assignment.controllers;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import kr.megaptera.backend.weekd02.assignment.utils.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ProductControllerTests {
    @Autowired
    private ProductController productController;

    @DisplayName("contextLoads")
    void contextLoads() {
        assert productController != null;
    }

    @DisplayName("상품 목록")
    @Test
    void getProducts() {
        String requestPath = "/products/";

        String expectedResponseBody = "상품 목록\n";

        // TODO: want to pass test regardless of trailing slash
        ExtractableResponse<Response> response = ApiClient._get(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("상품 상세")
    @Test
    void getProduct() {
        int productId = 1;
        String requestPath = "/products/%d".formatted(productId);

        String expectedResponseBody = "상품 상세\n";

        ExtractableResponse<Response> response = ApiClient._get(requestPath);

        // then
        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }
}
