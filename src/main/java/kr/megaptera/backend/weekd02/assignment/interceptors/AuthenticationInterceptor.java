package kr.megaptera.backend.weekd02.assignment.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) {
        System.out.println(request.getQueryString());
        // 사용자 인증
        request.setAttribute("userId", "1");
        return true;        //false면 Controller로 진입 못 함
    }
}
