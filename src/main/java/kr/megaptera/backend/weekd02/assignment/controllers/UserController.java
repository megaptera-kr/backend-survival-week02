package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class UserController {

    @GetMapping("/")
    public String myDetail (@RequestAttribute String userId) {
        return "나의 정보 : " + userId + "\n";
    }

    @PatchMapping("/")
    public String update (
          @RequestAttribute String userId,
          @RequestBody String profileDto
    ) {
        return "나의 정보 수정 완료 " + profileDto + "\n";
    }
}
