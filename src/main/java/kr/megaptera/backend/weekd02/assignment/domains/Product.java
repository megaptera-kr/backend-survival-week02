package kr.megaptera.backend.weekd02.assignment.domains;

public class Product {
  private final Long id;
  private final String name;

  public Product(Long id, String name) {
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
