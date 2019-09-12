package fr.formation.rncp.services;

import fr.formation.rncp.business.dtos.DiplomaDto;
import fr.formation.rncp.business.dtos.DiplomaEndDto;
import fr.formation.rncp.business.dtos.DiplomaListDto;
import fr.formation.rncp.business.entities.Diploma;
import fr.formation.rncp.business.repositories.DiplomaJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class DiplomaServiceImpl extends AbstractService implements DiplomaService {

  @Autowired
  private ModelMapper modelMapper;

  private final DiplomaJpaRepository repo;

  protected DiplomaServiceImpl(DiplomaJpaRepository repo) {
    this.repo = repo;
  }

  @Override
  public void create(DiplomaDto diploma) {
 //   Diploma entity = new Diploma();
  //  populateEntity(diploma, entity);
    //Version avec modelMapper
    Diploma entity = modelMapper.map(diploma, Diploma.class); // On prend Diploma.class car le diplome n'est pas encore creer
    repo.save(entity);
  }

  private void populateEntity(DiplomaDto diploma, Diploma entity) {
    entity.setName(diploma.getName());
    entity.setStartDate(diploma.getStartDate());
    entity.setEndDate(diploma.getEndDate());
    entity.setLevel(diploma.getLevel());
  }

  @Override
  public DiplomaDto one(Long id) {
    Diploma entity = findById(id, repo);
    DiplomaDto diploma = new DiplomaDto();
    diploma.setName(entity.getName());
    diploma.setStartDate(entity.getStartDate());
    diploma.setLevel(entity.getLevel());
    diploma.setEndDate(entity.getEndDate());
    return diploma;
  }

  @Override
  public DiplomaListDto list(Integer pageNumber) {
    DiplomaListDto result = new DiplomaListDto();
    Pageable pageable = PageRequest.of(pageNumber, 5, Sort.by("name"));
    Page<DiplomaDto> page = repo.list(pageable);
    result.setDiplomas(page.getContent());
    return result;
  }

  @Override
  public void delete(Long id) {
    repo.deleteById(id);
  }

  @Override
  public void update(Long id, DiplomaDto diploma) {
    // findById returns an Optional
    Diploma entity = findById(id, repo);
  //  populateEntity(diploma, entity);
    modelMapper.map(diploma, entity);
    repo.save(entity);
  }

  @Override
  public void patchEndDate(Long id, DiplomaEndDto diploma) {
    repo.patchEndDate(id, diploma.getEndDate());
  }
}
