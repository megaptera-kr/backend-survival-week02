package kr.megaptera.backend.weekd02.assignment.controllers;

import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String join(@RequestAttribute String userId,
                       @RequestParam String id, @RequestParam String password){
        // 저장소가 따로 없으므로 로그인 회원이라도 가입여부 확인하는 로직
        if (Strings.isNotBlank(userId) && userId.equals(id)) {
            return "이미 가입된 id 입니다.";
        }
        return "회원가입 완료\n id : " + id + " password : " + password;
    }

    @GetMapping("/me")
    @ResponseStatus(HttpStatus.OK)
    public String getProfile(@RequestAttribute String userId){
        return "내 정보 조회\n id : " + userId;
    }

    @PatchMapping("/me")
    @ResponseStatus(HttpStatus.OK)
    public String setProfile(@RequestParam String id,
                             @RequestParam(required = false) String password){
        return "내 정보 수정\n id : " + id + " password : " + password;
    }
}
