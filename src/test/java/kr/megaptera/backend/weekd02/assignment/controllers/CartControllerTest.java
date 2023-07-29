package kr.megaptera.backend.weekd02.assignment.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class CartControllerTest {
    @Autowired
    MockMvc mockMvc;

    @DisplayName("장바구니에 상품 추가를 테스트한다")
    @Test
    void add() throws Exception {
        // Given
        String userId = "1";

        // When // Then
        mockMvc.perform(
                        post("/cart")
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().string("방바구니에 상품 추가: " + userId));
    }

    @DisplayName("장바구니에 상품 삭제를 테스트한다")
    @Test
    void delete() throws Exception {
        // Given
        String userId = "1";
        String cartItemId = "1";

        // When // Then
        mockMvc.perform(
                        MockMvcRequestBuilders.delete("/cartItems/{cartItemId}", cartItemId)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("장바구니에 상품 삭제: " + userId + ":" + cartItemId));
    }

    @DisplayName("장바구니 (담긴 상품 목록) 조회를 테스트한다")
    @Test
    void list() throws Exception {
        // Given
        String userId = "1";

        // When // Then
        mockMvc.perform(
                        get("/cart")
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("장바구니 (담긴 상품 목록): " + userId));
    }
}