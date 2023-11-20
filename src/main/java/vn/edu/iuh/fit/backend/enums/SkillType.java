package vn.edu.iuh.fit.backend.enums;

import jakarta.persistence.Embeddable;


public enum SkillType {
    SOFT_SKILL(1),
    UNSPECIFIC(0),
    TECHNICAL_SKILL(2);

    private int value;

    private SkillType(int value){
        this.value = value;
    }


}
