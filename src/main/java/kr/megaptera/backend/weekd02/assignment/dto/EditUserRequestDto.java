package kr.megaptera.backend.weekd02.assignment.dto;

public class EditUserRequestDto {
  private String email;
  private String address;
  private String nickname;

  @Override
  public String toString() {
    return "EditUserRequestDto{" +
      "email='" + email + '\'' +
      ", address='" + address + '\'' +
      ", nickname='" + nickname + '\'' +
      '}';
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
}
