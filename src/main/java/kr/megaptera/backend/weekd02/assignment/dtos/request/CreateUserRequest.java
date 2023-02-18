package kr.megaptera.backend.weekd02.assignment.dtos.request;

public class CreateUserRequest {
  private String name;

  public CreateUserRequest(String name) {
    this.name = name;
  }

  public CreateUserRequest() {
  }

  public String getName() {
    return name;
  }
}
