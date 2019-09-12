package fr.formation.rncp.business.dtos;

import java.util.List;

public class DiplomaListDto {

  // Additional properties
  private List<DiplomaDto> diplomas;

  public DiplomaListDto() {
  }

  public List<DiplomaDto> getDiplomas() {
    return diplomas;
  }

  public void setDiplomas(List<DiplomaDto> diplomas) {
    this.diplomas = diplomas;
  }
}
