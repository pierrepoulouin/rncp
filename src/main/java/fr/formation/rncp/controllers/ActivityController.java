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

import fr.formation.rncp.business.dtos.ActivityCreateDto;
import fr.formation.rncp.business.dtos.ActivityDto;
import fr.formation.rncp.business.dtos.ActivityUpdateDto;
import fr.formation.rncp.services.ActivityService;

@RestController
@RequestMapping("/activities")
public class ActivityController {

  private final ActivityService service;

  protected ActivityController(ActivityService service) {
    this.service = service;
  }

  @PostMapping
  public void create(@RequestBody @Valid ActivityCreateDto activity) {
    service.create(activity);
  }

  @GetMapping("/{id}")
  public ActivityDto one(@PathVariable("id") Long id) {
    return service.one(id);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Long id) {
    service.delete(id);
  }

  @PutMapping("/{id}")
  public void update(@PathVariable("id") Long id,
                     @RequestBody @Valid ActivityUpdateDto activity) {
    service.update(id, activity);
  }
}
