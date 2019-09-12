package fr.formation.rncp.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.rncp.business.dtos.SkillCreateDto;
import fr.formation.rncp.business.dtos.SkillDto;
import fr.formation.rncp.business.dtos.SkillUpdateDto;
import fr.formation.rncp.services.SkillService;

@RestController
@RequestMapping("/skills")
public class SkillController {

  private final SkillService service;

  protected SkillController(SkillService service) {
    this.service = service;
  }

  @PostMapping
  public void create(@RequestBody @Valid SkillCreateDto Skill) {
    service.create(Skill);
  }

  @GetMapping("/{id}")
  public SkillDto one(@PathVariable("id") Long id) {
    return service.one(id);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Long id) {
    service.delete(id);
  }

  @PutMapping("/{id}")
  public void update(@PathVariable("id") Long id,
                     @RequestBody @Valid SkillUpdateDto skill) {
    service.update(id, skill);
  }
}
