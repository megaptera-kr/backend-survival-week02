package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yhjs1211/users")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String join(@RequestBody String userId) {
        String msg = userId + "로 가입되었습니다\n";
        return msg;
    }

    @GetMapping("/me")
    @ResponseStatus(HttpStatus.OK)
    public String info(
            @RequestAttribute("userId") String userId
    ) {
        String msg = "내 정보 조회 : " + userId + "\n";
        return msg;
    }

    @PatchMapping("/me")
    @ResponseStatus(HttpStatus.OK)
    public String update() {
        String msg = "개인정보 업데이트 완료\n";
        return msg;
    }
}
