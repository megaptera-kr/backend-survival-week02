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
public class CartControllerTests {
    @Autowired
    private CartController cartController;

    @DisplayName("contextLoads")
    void contextLoads() {
        assert cartController != null;
    }

    @DisplayName("장바구니에 상품 추가")
    @Test
    void addProductsToCart() {
        String requestPath = "/users/me/cart/products";
        HashMap<String, String> requestBody = new HashMap<>() {{
            put("key", "value");
        }};

        String expectedResponseBody = "장바구니에 상품 추가\n";

        ExtractableResponse<Response> response = ApiClient._post(requestPath, requestBody);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("장바구니에 상품 삭제")
    @Test
    void deleteProductsFromCart() {
        String requestPath = "/users/me/cart/products";

        String expectedResponseBody = "장바구니에 상품 삭제\n";

        ExtractableResponse<Response> response = ApiClient._delete(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("장바구니 (담긴 상품 목록)")
    @Test
    void getProductsInCart() {
        String requestPath = "/users/me/cart/products";

        String expectedResponseBody = "장바구니 (담긴 상품 목록)\n";

        ExtractableResponse<Response> response = ApiClient._get(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }
}
