package fr.formation.rncp.business.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ActivityCreateDto {

  @NotBlank
  @Size(min = 1, max = 255)
  private String description;

  @NotNull
  private Long diplomaId;

  public ActivityCreateDto() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getDiplomaId() {
    return diplomaId;
  }

  public void setDiplomaId(Long diplomaId) {
    this.diplomaId = diplomaId;
  }
}
