package fr.formation.rncp.business.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import fr.formation.rncp.business.Level;

public class DiplomaDto {

  @NotBlank
  @Size(min = 1, max = 200)
  private String name;

  @NotNull
  @PastOrPresent
  private LocalDate startDate;

  @Future
  private LocalDate endDate;

  @NotNull
  private Level level;

  public DiplomaDto() {
  }

  public DiplomaDto(String name, LocalDate startDate, LocalDate endDate,
                    Level level) {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endStart) {
    this.endDate = endStart;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }
}
