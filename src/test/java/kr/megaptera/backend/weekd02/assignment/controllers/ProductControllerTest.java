package kr.megaptera.backend.weekd02.assignment.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ProductControllerTest {
    @Autowired
    MockMvc mockMvc;

    @DisplayName("상품 목록 조회를 테스트한다")
    @Test
    void getProducts() throws Exception {
        // Given
        // When // Then
        mockMvc.perform(
                        get("/products")
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @DisplayName("상품 상세 조회를 테스트한다")
    @Test
    void getProduct() throws Exception {
        // Given
        Long productId = 5L;
        String userId = "1";

        // When // Then
        mockMvc.perform(
                        get("/products/{productId}", productId)
                )
                .andDo(print())
                .andExpect(content().string("상품 상세 조회: " + userId + ":" + productId));
    }
}