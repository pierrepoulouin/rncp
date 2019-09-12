package fr.formation.rncp.business.repositories;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import fr.formation.rncp.business.dtos.DiplomaDto;
import fr.formation.rncp.business.entities.Diploma;

public interface DiplomaJpaRepository extends JpaRepository<Diploma, Long> {

    @Transactional
    @Modifying
    @Query("update Diploma set endDate = ?2 where id = ?1")
    void patchEndDate(Long id, LocalDate endDate);

    @Query("select new fr.formation.rncp.business.dtos.DiplomaDto"
	    + "(d.name, d.startDate, d.endDate, d.level) " + "from Diploma d")
    Page<DiplomaDto> list(Pageable pageable);
}
