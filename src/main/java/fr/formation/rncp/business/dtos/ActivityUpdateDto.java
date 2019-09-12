package fr.formation.rncp.business.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ActivityUpdateDto {

  @NotBlank
  @Size(min = 1, max = 255)
  private String description;

  public ActivityUpdateDto() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
