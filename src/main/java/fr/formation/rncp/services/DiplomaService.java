package fr.formation.rncp.services;

import fr.formation.rncp.business.dtos.DiplomaDto;
import fr.formation.rncp.business.dtos.DiplomaEndDto;
import fr.formation.rncp.business.dtos.DiplomaListDto;

public interface DiplomaService {

  void create(DiplomaDto diploma);

  DiplomaDto one(Long id);

  DiplomaListDto list(Integer page);

  void delete(Long id);

  void update(Long id, DiplomaDto diploma);

  void patchEndDate(Long id, DiplomaEndDto diploma);
}
