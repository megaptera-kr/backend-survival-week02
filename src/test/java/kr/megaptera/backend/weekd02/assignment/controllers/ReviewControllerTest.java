package kr.megaptera.backend.weekd02.assignment.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ReviewControllerTest {
    @Autowired
    MockMvc mockMvc;

    @DisplayName("상품에 리뷰 작성을 테스트한다")
    @Test
    void write() throws Exception {
        // Given
        String productId = "1";
        String userId = "1";

        // When // Then
        mockMvc.perform(
                        post("/products/{productId}/reviews", productId)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().string("상품에 리뷰 작성: " + userId + ":" + productId));
    }

    @DisplayName("상품에 리뷰 수정을 테스트한다")
    @Test
    void modify() throws Exception {
        // Given
        String productId = "1";
        String userId = "1";
        String reviewId = "2";

        // When // Then
        mockMvc.perform(
                        patch("/products/{productId}/reviews/{reviewId}", productId, reviewId)
                )
                .andDo(print())
                .andExpect(
                        content().string("상품에 리뷰 수정: " + userId + ":" + productId + ":" + reviewId)
                );
    }

    @DisplayName("상품에 리뷰 삭제를 테스트한다")
    @Test
    void delete() throws Exception {
        // Given
        String productId = "1";
        String userId = "1";
        String reviewId = "2";

        // When // Then
        mockMvc.perform(
                        MockMvcRequestBuilders.delete("/products/{productId}/reviews/{reviewId}", productId, reviewId)
                )
                .andDo(print())
                .andExpect(
                        content().string("상품에 리뷰 삭제: " + userId + ":" + productId + ":" + reviewId)
                );
    }
}