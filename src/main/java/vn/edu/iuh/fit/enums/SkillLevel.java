package vn.edu.iuh.fit.enums;

import jakarta.persistence.Embeddable;

@Embeddable
public enum SkillLevel {
    MASTER(5),
    BEGINNER(1),
    ADVANCED(2),
    PROFESSIONAL(4),
    INTERMEDIATE(3);

    private int value;
    SkillLevel(int value){
        this.value = value;
    }

}
