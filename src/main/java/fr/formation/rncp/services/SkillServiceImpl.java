package fr.formation.rncp.services;

import fr.formation.rncp.business.dtos.SkillCreateDto;
import fr.formation.rncp.business.dtos.SkillDto;
import fr.formation.rncp.business.dtos.SkillUpdateDto;
import fr.formation.rncp.business.entities.Activity;
import fr.formation.rncp.business.entities.Skill;
import fr.formation.rncp.business.repositories.ActivityJpaRepository;
import fr.formation.rncp.business.repositories.SkillJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl extends AbstractService implements SkillService {

  private final SkillJpaRepository skillRepo;

  private final ActivityJpaRepository activityRepo;

  protected SkillServiceImpl(SkillJpaRepository skillRepo,
                             ActivityJpaRepository activityRepo) {
    this.skillRepo = skillRepo;
    this.activityRepo = activityRepo;
  }

  @Override
  public void create(SkillCreateDto skill) {
    Activity activity = activityRepo.getOne(skill.getActivityId());
    Skill entity = new Skill();
    entity.setActivity(activity);
    entity.setDescription(skill.getDescription());
    skillRepo.save(entity);
  }

  @Override
  public SkillDto one(Long id) {
    Skill entity = findById(id, skillRepo);
    SkillDto skill = new SkillDto();
    skill.setId(entity.getId());
    skill.setDescription(entity.getDescription());
    return skill;
  }

  @Override
  public void delete(Long id) {
    skillRepo.deleteById(id);
  }

  @Override
  public void update(Long id, SkillUpdateDto skill) {
    Skill entity = findById(id, skillRepo);
    entity.setDescription(skill.getDescription());
    skillRepo.save(entity);
  }
}
