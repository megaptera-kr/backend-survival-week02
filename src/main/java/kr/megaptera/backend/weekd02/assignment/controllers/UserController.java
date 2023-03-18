package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.models.User;
import kr.megaptera.backend.weekd02.assignment.services.SessionManager;
import kr.megaptera.backend.weekd02.assignment.services.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserManager userManager;
    private final SessionManager sessionManager;

    @PostMapping
    public ResponseEntity add(@RequestBody User user) {

        if (userManager.isExist(user.getName())) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

        userManager.add(user);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @GetMapping("/me")
    public ResponseEntity getMe(
            @RequestHeader("Authorization") String authorization) {

        var sessionId = Integer.parseInt(authorization);
        var session = sessionManager.get(sessionId);
        var user = userManager.get(session.getUserId());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(user);
    }

    @PatchMapping("/me")
    public ResponseEntity updateMe(
            @RequestHeader("Authorization") String authorizationText,
            @RequestBody User updateUser) {

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        var user = userManager.get(session.getUserId());

        updateUser.setName(user.getName());
        userManager.update(updateUser);

        return ResponseEntity.status(HttpStatus.OK).body(updateUser);
    }
}
