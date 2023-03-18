package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.services.CartManager;
import kr.megaptera.backend.weekd02.assignment.services.OrderManager;
import kr.megaptera.backend.weekd02.assignment.services.SessionManager;
import kr.megaptera.backend.weekd02.assignment.services.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final CartManager cartManager;
    private final OrderManager orderManager;
    private final SessionManager sessionManager;
    private final UserManager userManager;

    @PostMapping
    public ResponseEntity add(
            @RequestHeader("Authorization") String authorizationText) {

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        if (session == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var user = userManager.get(session.getUserId());
        if (user == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var carts = cartManager.getAll(user.getName());
        var order = orderManager.add(user.getName(), carts);

        return ResponseEntity.ok(order);
    }

    @GetMapping
    public ResponseEntity get(
            @RequestHeader("Authorization") String authorizationText) {

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        if (session == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var user = userManager.get(session.getUserId());
        if (user == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var orders = orderManager.getAll(user.getName());

        return ResponseEntity.ok(orders);
    }
}
