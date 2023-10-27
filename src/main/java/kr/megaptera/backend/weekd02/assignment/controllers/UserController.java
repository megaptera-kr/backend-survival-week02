package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.User;
import kr.megaptera.backend.weekd02.assignment.exceptions.SessionNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private SessionController sessionController;

    private Map<String, User> users = new HashMap<>();

    // 회원가입
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody String userDTO) {
        // userDTO 파싱해서 얻은 키벨류로 users 에서 contains 체크
        // 사용자 생성 및 저장 로직
        return "회원 가입" + userDTO + "\n";
    }

    // 로그인
    @PostMapping("/login")
    public String login(@RequestBody String userDTO) {
        // 로그인 처리
        //userDTO 파싱
        // 주어진 사용자 ID에 대한 비밀번호 확인
//        String storedPassword = users.get(userId);
        // 세션 생성
//        sessionController.createSession(userId);
        return "로그인 성공";
    }

    // 로그아웃
    @PostMapping("/logout")
    public String logout() {
        // 로그아웃 처리 로직
        sessionController.deleteSession();
        return "로그아웃 성공";
    }

    // 내 정보 조회
    @GetMapping("/{user_id}")
    public String getUser(@PathVariable Long user_id) throws SessionNotFound {
        System.out.println("user_id in getUser: " + user_id);
        sessionController.verifySession();
        // 사용자 정보 조회 로직
        return "your information";
    }

    // 내 정보 수정
    @PutMapping("/{user_id}")
    public String updateUser(@PathVariable Long user_id, @RequestBody String userDTO) throws SessionNotFound {
        sessionController.verifySession();
        // 사용자 정보 업데이트 로직
        return "정보 수정 완료" + userDTO + "\n";
    }

}
