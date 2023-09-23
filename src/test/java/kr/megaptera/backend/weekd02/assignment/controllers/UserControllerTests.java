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
public class UserControllerTests {
    @Autowired
    private UserController userController;

    @DisplayName("contextLoads")
    void contextLoads() {
        assert userController != null;
    }

    @DisplayName("회원가입")
    @Test
    void postUsers() {
        String requestPath = "/users";
        HashMap<String, String> requestBody = new HashMap<>() {{
            put("key", "value");
        }};

        String expectedResponseBody = "회원가입\n";

        ExtractableResponse<Response> response = ApiClient._post(requestPath, requestBody);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("내 정보")
    @Test
    void getMe() {
        String requestPath = "/users/me";

        String expectedResponseBody = "내 정보\n";

        ExtractableResponse<Response> response = ApiClient._get(requestPath);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }

    @DisplayName("내 정보 수정")
    @Test
    void putMe() {
        String requestPath = "/users/me";
        HashMap<String, String> requestBody = new HashMap<>() {{
            put("key", "value");
        }};

        String expectedResponseBody = "내 정보 수정\n";

        ExtractableResponse<Response> response = ApiClient._put(requestPath, requestBody);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.asString()).isEqualTo(expectedResponseBody);
    }
}
