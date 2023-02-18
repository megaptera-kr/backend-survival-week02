package kr.megaptera.backend.weekd02.assignment.interceptors;

import jakarta.servlet.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.*;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) {
        System.out.println("인터셉터 작동중..");
        // 사용자 인증
        request.setAttribute("userId", "1");
        return true;
    }
}
