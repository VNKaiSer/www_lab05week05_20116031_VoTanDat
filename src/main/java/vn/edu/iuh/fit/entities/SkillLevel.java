package vn.edu.iuh.fit.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Embeddable
public enum SkillLevel {
    MASTER,
    BEGINER,
    ADVANCED,
    PROFESSIONAL,
    IMTERMEDIATE

}
