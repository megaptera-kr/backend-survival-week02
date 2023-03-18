package kr.megaptera.backend.weekd02.assignment.controllers;


import kr.megaptera.backend.weekd02.assignment.models.AddCartRequest;
import kr.megaptera.backend.weekd02.assignment.services.CartManager;
import kr.megaptera.backend.weekd02.assignment.services.ProductManager;
import kr.megaptera.backend.weekd02.assignment.services.SessionManager;
import kr.megaptera.backend.weekd02.assignment.services.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
@RequiredArgsConstructor
public class CartController {
    private final ProductManager productManager;
    private final SessionManager sessionManager;
    private final UserManager userManager;
    private final CartManager cartManager;

    @GetMapping
    public ResponseEntity getAll(
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
        return ResponseEntity.ok(carts);
    }

    @PostMapping
    public ResponseEntity addCart(
            @RequestHeader("Authorization") String authorizationText,
            @RequestBody AddCartRequest request) {

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        if (session == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var user = userManager.get(session.getUserId());
        if (user == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var product = productManager.get(request.getProductId());
        if (product == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var cart = cartManager.add(user.getName(), request);
        return ResponseEntity.ok(cart);
    }

    @DeleteMapping("/{cartId}")
    public ResponseEntity deleteCart(
            @RequestHeader("Authorization") String authorizationText,
            @PathVariable long cartId) {

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        if (session == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var user = userManager.get(session.getUserId());
        if (user == null) {
            return ResponseEntity.badRequest().body(null);
        }

        cartManager.remove(cartId);
        return ResponseEntity.ok(null);
    }
}
