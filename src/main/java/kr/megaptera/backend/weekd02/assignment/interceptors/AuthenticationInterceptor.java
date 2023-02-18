package kr.megaptera.backend.weekd02.assignment.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.megaptera.backend.weekd02.assignment.util.SessionUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler) {

    // 사용자 인증
    request.setAttribute(SessionUtil.USER_ID_ATTRIBUTE, "1");
    return true;
  }
}
