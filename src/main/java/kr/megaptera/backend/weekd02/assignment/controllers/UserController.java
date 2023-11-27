package kr.megaptera.backend.weekd02.assignment.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public String signup() {
        // 그냥 controller 만 만드는건지 아니면 service repository 까지 생성해야하는지 잘 모르곘습니다 !
        return "signup";
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(
            @RequestBody String email,
            @RequestBody String password
    ) {
        System.out.println("email : " + email);
        System.out.println("password : " + password);
        return "login";
    }

    @PutMapping("logout")
    @ResponseStatus(HttpStatus.OK)

    public String logout() {
        return "logout";
    }

    @GetMapping("me")
    @ResponseStatus(HttpStatus.OK)
    public String myinfo(
            @RequestAttribute String userId
    ) {
        return "myinfo:"+userId+"\n";
    }
}
