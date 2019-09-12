package fr.formation.rncp.business.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

public class DiplomaEndDto {

  @NotNull
  @Future
  private LocalDate endDate;

  public DiplomaEndDto() {
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endStart) {
    this.endDate = endStart;
  }
}
