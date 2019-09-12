package fr.formation.rncp.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.rncp.business.entities.Activity;

public interface ActivityJpaRepository extends JpaRepository<Activity, Long> {
}
