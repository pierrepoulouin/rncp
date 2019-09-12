package fr.formation.rncp.business.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SkillCreateDto {

  @NotBlank
  @Size(min = 1, max = 255)
  private String description;

  @NotNull
  private Long activityId;

  public SkillCreateDto() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }
}
