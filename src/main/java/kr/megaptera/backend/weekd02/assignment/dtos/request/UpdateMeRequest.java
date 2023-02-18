package kr.megaptera.backend.weekd02.assignment.dtos.request;

public class UpdateMeRequest {

  private String name;

  public UpdateMeRequest(String name) {
    this.name = name;
  }

  public UpdateMeRequest() {
  }

  public String getName() {
    return name;
  }


}
