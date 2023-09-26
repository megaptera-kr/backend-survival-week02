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
public class SessionControllerTests {
    @Autowired
    private SessionController sessionController;

    @DisplayName("contextLoads")
    void contextLoads() {
        assert sessionController != null;
    }

    @DisplayName("로그인")
    @Test
    void getSession() {
        String requestPath = "/session";

        String expectedResponseBody = "로그인\n";

        ExtractableResponse<Response> response = ApiClient._get(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("로그아웃")
    @Test
    void deleteSession() {
        String requestPath = "/session";

        String expectedResponseBody = "로그아웃\n";

        ExtractableResponse<Response> response = ApiClient._delete(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }
}
