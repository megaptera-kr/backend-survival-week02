package kr.megaptera.backend.weekd02.assignment.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class UserControllerTest {
    @Autowired
    MockMvc mockMvc;

    @DisplayName("회원가입을 테스트한다")
    @Test
    void join() throws Exception {
        // Given
        // When // Then
        mockMvc.perform(
                        post("/users")
                )
                .andDo(print())
                .andExpect(content().string("회원가입: 1"))
                .andExpect(status().isCreated());
    }

    @DisplayName("내 정보 보기를 테스트한다")
    @Test
    void getMe() throws Exception {
        // Given
        // When // Then
        mockMvc.perform(
                        get("/users/me")
                )
                .andDo(print())
                .andExpect(content().string("내 정보 보기: 1"))
                .andExpect(status().isOk());
    }

    @DisplayName("내 정보 수정을 테스트한다")
    @Test
    void updateMe() throws Exception {
        // Given
        // When // Then
        mockMvc.perform(
                        patch("/users/me")
                )
                .andDo(print())
                .andExpect(content().string("내 정보 수정: 1"))
                .andExpect(status().isOk());
    }
}