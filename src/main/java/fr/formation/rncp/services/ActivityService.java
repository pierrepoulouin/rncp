package fr.formation.rncp.services;

import fr.formation.rncp.business.dtos.ActivityCreateDto;
import fr.formation.rncp.business.dtos.ActivityDto;
import fr.formation.rncp.business.dtos.ActivityUpdateDto;

public interface ActivityService {

  void create(ActivityCreateDto activity);

  ActivityDto one(Long id);

  void delete(Long id);

  void update(Long id, ActivityUpdateDto activity);
}
