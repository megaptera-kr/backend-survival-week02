package kr.megaptera.backend.weekd02.assignment.dto;

public class SignupRequestDto {
  private String email;
  private String address;
  private String nickname;

  private String username;
  private String password;

  @Override
  public String toString() {
    return "SignupRequestDto{" +
      "email='" + email + '\'' +
      ", address='" + address + '\'' +
      ", nickname='" + nickname + '\'' +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
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

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
