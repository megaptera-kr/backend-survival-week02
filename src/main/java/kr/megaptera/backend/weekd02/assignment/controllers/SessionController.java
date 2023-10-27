package kr.megaptera.backend.weekd02.assignment.controllers;

import jakarta.servlet.http.HttpSession;
import kr.megaptera.backend.weekd02.assignment.exceptions.SessionNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private HttpSession session;

    // 세션 생성
    @PostMapping
    public boolean createSession(String userId) {
        // 사용자 ID를 세션에 저장
        session.setAttribute("userId", userId);
        return true;
    }

    // 세션 조회
    @GetMapping
    public ResponseEntity<String> getSession() {
        // 세션에서 사용자 ID를 가져옴
        String userId = (String) session.getAttribute("userId");
        if (userId != null) {
            return ResponseEntity.ok("현재 로그인된 사용자: " + userId);
        } else {
            return ResponseEntity.ok("세션이 존재하지 않음");
        }
    }

    // 세션 삭제
    @DeleteMapping
    public ResponseEntity<String> deleteSession() {
        // 세션에서 사용자 ID를 제거
        session.removeAttribute("userId");
        return ResponseEntity.ok("세션 삭제 성공");
    }


    // 외부 클래스에서 세션 검증을 수행
    public boolean verifySession() throws SessionNotFound {
        String userId = (String) session.getAttribute("userId");
        if (userId != null) {
            return true;
        } else {
            throw new SessionNotFound();
        }
    }
}
