package fr.formation.rncp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Activity extends AbstractEntity {

  @Column(nullable = false)
  private String description;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(nullable = false)
  private Diploma diploma;

  public Activity() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Diploma getDiploma() {
    return diploma;
  }

  public void setDiploma(Diploma diploma) {
    this.diploma = diploma;
  }
}
