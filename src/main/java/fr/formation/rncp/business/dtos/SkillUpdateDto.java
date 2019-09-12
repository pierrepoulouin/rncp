package fr.formation.rncp.business.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SkillUpdateDto {

  @NotBlank
  @Size(min = 1, max = 255)
  private String description;

  public SkillUpdateDto() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
