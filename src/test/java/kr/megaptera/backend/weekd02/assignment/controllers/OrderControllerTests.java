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
public class OrderControllerTests {

    @Autowired
    private OrderController orderController;

    @DisplayName("contextLoads")
    void contextLoads() {
        assert orderController != null;
    }

    @DisplayName("주문하기")
    @Test
    void postOrders() {
        String requestPath = "/orders";
        HashMap<String, String> requestBody = new HashMap<>() {{
            put("key", "value");
        }};

        String expectedResponseBody = "주문하기\n";

        ExtractableResponse<Response> response = ApiClient._post(requestPath, requestBody);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("주문 목록")
    @Test
    void getOrders() {
        String requestPath = "/orders";

        String expectedResponseBody = "주문 목록\n";

        ExtractableResponse<Response> response = ApiClient._get(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }
}
