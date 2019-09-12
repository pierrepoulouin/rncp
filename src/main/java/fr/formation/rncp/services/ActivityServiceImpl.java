package fr.formation.rncp.services;

import fr.formation.rncp.business.dtos.ActivityCreateDto;
import fr.formation.rncp.business.dtos.ActivityDto;
import fr.formation.rncp.business.dtos.ActivityUpdateDto;
import fr.formation.rncp.business.entities.Activity;
import fr.formation.rncp.business.entities.Diploma;
import fr.formation.rncp.business.repositories.ActivityJpaRepository;
import fr.formation.rncp.business.repositories.DiplomaJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl extends AbstractService implements ActivityService {

  private final ActivityJpaRepository activityRepo;

  private final DiplomaJpaRepository diplomaRepo;

  protected ActivityServiceImpl(ActivityJpaRepository activityRepo,
                                DiplomaJpaRepository diplomaRepo) {
    this.activityRepo = activityRepo;
    this.diplomaRepo = diplomaRepo;
  }

  @Override
  public void create(ActivityCreateDto activity) {
    Diploma diploma = diplomaRepo.getOne(activity.getDiplomaId());
    Activity entity = new Activity();
    entity.setDiploma(diploma);
    entity.setDescription(activity.getDescription());
    activityRepo.save(entity);
  }

  @Override
  public ActivityDto one(Long id) {
    Activity entity = findById(id, activityRepo);
    ActivityDto activity = new ActivityDto();
    activity.setId(entity.getId());
    activity.setDescription(entity.getDescription());
    return activity;
  }

  @Override
  public void delete(Long id) {
    activityRepo.deleteById(id);
  }

  @Override
  public void update(Long id, ActivityUpdateDto activity) {
    Activity entity = findById(id, activityRepo);
    entity.setDescription(activity.getDescription());
    activityRepo.save(entity);
  }
}
