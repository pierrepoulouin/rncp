package fr.formation.rncp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skill extends AbstractEntity {

  @Column(nullable = false)
  private String description;

  @ManyToOne
  @JoinColumn(nullable = false)
  private Activity activity;

  public Skill() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Activity getActivity() {
    return activity;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }
}
