package kr.megaptera.backend.weekd02.assignment.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class OrderControllerTest {
    @Autowired
    MockMvc mockMvc;

    @DisplayName("주문하기를 테스트한다")
    @Test
    void order() throws Exception {
        // Given
        String userId = "1";

        // When // Then
        mockMvc.perform(
                        post("/cart/orders")
                )
                .andDo(print())
                .andExpect(content().string("주문하기: " + userId))
                .andExpect(status().isOk());
    }

    @DisplayName("주묵 목록 조회를 테스트한다")
    @Test
    void list() throws Exception {
        // Given
        String userId = "1";

        // When // Then
        mockMvc.perform(
                        get("/cart/orders")
                )
                .andDo(print())
                .andExpect(content().string("주문목록: " + userId))
                .andExpect(status().isOk());
    }
}