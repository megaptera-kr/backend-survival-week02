package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.dtos.request.CreateUserRequest;
import kr.megaptera.backend.weekd02.assignment.dtos.response.CreateUserResponse;
import kr.megaptera.backend.weekd02.assignment.dtos.response.GetMeResponse;
import kr.megaptera.backend.weekd02.assignment.dtos.request.UpdateMeRequest;
import kr.megaptera.backend.weekd02.assignment.dtos.response.UpdateMeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  @GetMapping("/me")
  public GetMeResponse getMe(@RequestAttribute Long userId) {
    return new GetMeResponse(userId, "Harry");
  }


  @PatchMapping("/me")
  public UpdateMeResponse updateMe(@RequestAttribute Long userId, @RequestBody UpdateMeRequest request) {
    return new UpdateMeResponse(userId, request.getName());
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
    Long newId = 2L;
    return new CreateUserResponse(newId, request.getName());
  }

}
