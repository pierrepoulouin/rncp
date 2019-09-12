package fr.formation.rncp.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.rncp.business.dtos.DiplomaDto;
import fr.formation.rncp.business.dtos.DiplomaEndDto;
import fr.formation.rncp.business.dtos.DiplomaListDto;
import fr.formation.rncp.services.DiplomaService;

@RestController
@RequestMapping("/diplomas")
public class DiplomaController {

  private final DiplomaService service;

  protected DiplomaController(DiplomaService service) {
    this.service = service;
  }

  @PostMapping
  public void create(@RequestBody @Valid DiplomaDto diploma) {
    service.create(diploma);
  }

  @GetMapping("/{id}")
  public DiplomaDto one(@PathVariable("id") Long id) {
    return service.one(id);
  }

  @GetMapping
  public DiplomaListDto list(@RequestParam("page") Integer page) {
    return service.list(page);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Long id) {
    service.delete(id);
  }

  @PutMapping("/{id}")
  public void update(@PathVariable("id") Long id,
                     @RequestBody @Valid DiplomaDto diploma) {
    service.update(id, diploma);
  }

  @PatchMapping("/{id}/end")
  public void patchEndDate(@PathVariable("id") Long id,
                           @RequestBody @Valid DiplomaEndDto diploma) {
    service.patchEndDate(id, diploma);
  }
}
