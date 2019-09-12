package fr.formation.rncp.services;

import fr.formation.rncp.business.dtos.SkillCreateDto;
import fr.formation.rncp.business.dtos.SkillDto;
import fr.formation.rncp.business.dtos.SkillUpdateDto;

public interface SkillService {

  void create(SkillCreateDto skill);

  SkillDto one(Long id);

  void delete(Long id);

  void update(Long id, SkillUpdateDto skill);
}
