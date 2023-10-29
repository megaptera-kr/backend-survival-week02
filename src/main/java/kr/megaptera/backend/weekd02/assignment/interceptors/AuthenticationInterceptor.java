package kr.megaptera.backend.weekd02.assignment.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) {

        // 사용자 인증
        request.setAttribute("userId", "1");
        System.out.println("request in AuthInterceptor " + request);
        return true;
    }
}
