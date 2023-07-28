package kr.megaptera.backend.weekd02.assignment.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class SessionControllerTest {
    @Autowired
    MockMvc mockMvc;

    @DisplayName("로그인을 테스트한다")
    @Test
    void login() throws Exception {
        // Given
        // When // Then
        mockMvc.perform(
                        post("/session")
                )
                .andDo(print())
                .andExpect(content().string("로그인: 1"))
                .andExpect(status().isOk());

    }

    @DisplayName("로그아웃을 테스트한다")
    @Test
    void logout() throws Exception {
        // Given
        // When // Then
        mockMvc.perform(
                        delete("/session")
                )
                .andDo(print())
                .andExpect(content().string("로그아웃: 1"))
                .andExpect(status().isOk());
    }
}