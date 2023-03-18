package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.models.SessionResponse;
import kr.megaptera.backend.weekd02.assignment.models.User;
import kr.megaptera.backend.weekd02.assignment.services.SessionManager;
import kr.megaptera.backend.weekd02.assignment.services.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
@RequiredArgsConstructor
public class SessionController {
    private final UserManager userManager;
    private final SessionManager sessionManager;

    @PostMapping
    public ResponseEntity login(@RequestBody User user){

        var findUser = userManager.get(user.getName());
        if(findUser == null){
            return ResponseEntity.badRequest().body(null);
        }

        var isPasswordSame = findUser.getPassword().equals(user.getPassword());
        if(!isPasswordSame){
            return ResponseEntity.badRequest().body(null);
        }

        var session = sessionManager.register(user.getName());

        var response = new SessionResponse(session.getId());
        return ResponseEntity.ok(response);
    }

    @DeleteMapping
    public ResponseEntity logout(
            @RequestHeader("Authorization") String authorizationText){

        var sessionId = Integer.parseInt(authorizationText);
        if(!sessionManager.isExist(sessionId)){
            return ResponseEntity.badRequest().body(null);
        }

        sessionManager.remove(sessionId);
        return ResponseEntity.ok(null);
    }
}
