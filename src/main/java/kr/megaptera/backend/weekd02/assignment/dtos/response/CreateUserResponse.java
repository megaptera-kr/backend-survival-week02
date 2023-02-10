package kr.megaptera.backend.weekd02.assignment.dtos.response;

public class CreateUserResponse {
  private final Long id;
  private final String name;

  public CreateUserResponse(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
