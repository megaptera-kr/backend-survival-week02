package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.dto.EditUserRequestDto;
import kr.megaptera.backend.weekd02.assignment.dto.SignupRequestDto;
import kr.megaptera.backend.weekd02.assignment.util.SessionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  final String PATH_ME = "/me";

  @PostMapping()
  public String signup(@RequestBody SignupRequestDto signupRequestDto) {
    return String.format("다음 정보(%s)로 회원가입이 정상적으로 진행되었습니다.", signupRequestDto);
  }

  @GetMapping(PATH_ME)
  public String getMyInfo(@RequestAttribute(SessionUtil.USER_ID_ATTRIBUTE) String userId) {
    return String.format("내 정보를 반환합니다. 내 유저 번호 : %s, 기타 정보 : ...", userId);
  }

  @PutMapping(PATH_ME)
  public String editMyInfo(@RequestAttribute(SessionUtil.USER_ID_ATTRIBUTE) String userId,
                           @RequestBody EditUserRequestDto editUserRequestDto) {
    return String.format("로그인 유저 %s번의 유저 정보가 다음과 같이 수정되었습니다.(%s)", userId, editUserRequestDto);
  }
}
