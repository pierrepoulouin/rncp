package fr.formation.rncp.business.dtos;

public class ActivityDto {

  private Long id;

  private String description;

  public ActivityDto() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
