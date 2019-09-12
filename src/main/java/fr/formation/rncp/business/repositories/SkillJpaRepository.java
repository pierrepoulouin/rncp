package fr.formation.rncp.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.rncp.business.entities.Skill;

public interface SkillJpaRepository extends JpaRepository<Skill, Long> {
}
